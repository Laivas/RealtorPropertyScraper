package scrapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.*;
import scrapperDatabase.SqliteDatabaseConnection;
import scrapperGenerated.Location;
import scrapperGenerated.Property;
import scrapperGenerated.RealtorDotComProp;
import scrapperModel.RealtorDotComProperty;
import scrapperModel.RealtorDotComPropertyParser;
import scrapperUtil.ConnectionSettings;
import scrapperUtil.CsvReaderWriter;
import scrapperUtil.CustomHttpClient;
import scrapperUtil.InputStreamDecoder;
import scrapperUtil.JsonToPojoGenerator;

@Setter
@Getter
public class RealtorScrapper extends Scrapper {

	private int index;

	private int currentPage;

	private int totalPages;

	private int houseOffersWritten;

	private String[] states = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
			"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
			"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
			"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
			"North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
			"South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
			"Wisconsin", "Wyoming" };

	private String[] statesCodes = { "AL", "AK", "AZ", "AR", "CA", "CZ", "CO", "CT", "DE", "DC", "FL", "GA", "GU", "HI",
			"ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH",
			"NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VI",
			"VA", "WA", "WV", "WI", "WY" };

	private String selectedState;

	private String city;

	private String state;

	private String cityState;

	private String mainUrl;

	private List<URL> urls;

	private SqliteDatabaseConnection sqliteDatabaseConnection;

	private CsvReaderWriter csvReaderWriter;

	private List<String[]> proxies;

	public RealtorScrapper() {

	}

	public String buildQueryUrl() {

		String queryUrl = buildAgentsSearchUrl(queryPage());

		return queryUrl;

	}

	public void query(String city, String state) {

		String cityState = "";

		if (!city.isEmpty() && !state.isEmpty()) {

			if (city.split("\\s+").length == 2) {

				city = city.split("\\s+")[0] + "-" + city.split("\\s+")[1];

			}

			if (state.length() == 2) {

				this.selectedState = state;

			}

			if (state.length() > 2) {

				this.selectedState = Arrays.asList(this.statesCodes).get(Arrays.asList(this.states).indexOf(state));

			}

			cityState = city + "_" + this.selectedState + "/";

		}

		if (city.isEmpty() && !state.isEmpty()) {

			if (state.contains(" ")) {

				state = state.replaceAll("\\s+", "-");

			}

			cityState = state + "/";

		}

		this.cityState = cityState;

	}

	private String buildAgentsSearchUrl(String page) {

		String queryUrl = this.mainUrl + this.cityState + page;

		return queryUrl;

	}

	private String queryPage() {

		String queryPage = "";

		if (getCurrentPage() == 0 && getTotalPages() == 0) {

			this.currentPage++;

			return queryPage = "pg-" + getCurrentPage() + "/";

		}

		if (getCurrentPage() == getTotalPages()) {

			return queryPage = "pg-" + this.totalPages + "/";

		}

		if (getCurrentPage() >= 1 && getCurrentPage() != getTotalPages()) {

			this.currentPage++;

			queryPage = "pg-" + getCurrentPage() + "/";

			return queryPage;

		}

		return queryPage;

	}

//	public List<RealtorDotComProperty> scrapPropertyPage(Document document) {
//
//		List<RealtorDotComProperty> properties = new ArrayList<RealtorDotComProperty>();
//
//		document.getElementsByAttributeValue("data-label", "pc-price").stream().forEach(e -> {
//
//			RealtorDotComProperty property = new RealtorDotComProperty();
//
//			property.setPrice(e.text());
//
//			properties.add(property);
//
//		});
//
//		index = 0;
//
//		document.getElementsByAttributeValueContaining("class", "statusText").stream().forEach(e -> {
//
//			properties.get(index).setStatus(e.text());
//
//			index++;
//
//		});
//
//		index = 0;
//
//		document.getElementsByAttributeValue("data-testid", "property-meta-container").stream().forEach(e -> {
//
//			if (e.getElementsByAttributeValue("data-label", "pc-meta-beds").size() > 0) {
//
//				properties.get(index).setBeds(e.getElementsByAttributeValue("data-label", "pc-meta-beds").text());
//
//			}
//
//			if (e.getElementsByAttributeValue("data-label", "pc-meta-baths").size() > 0) {
//
//				properties.get(index).setBaths(e.getElementsByAttributeValue("data-label", "pc-meta-baths").text());
//
//			}
//
//			if (e.getElementsByAttributeValue("data-label", "pc-meta-sqft").size() > 0) {
//
//				properties.get(index).setSqft(e.getElementsByAttributeValue("data-label", "pc-meta-sqft").text());
//
//			}
//
//			if (e.getElementsByAttributeValue("data-label", "pc-meta-sqftlot").size() > 0) {
//
//				properties.get(index).setSqftLot(e.getElementsByAttributeValue("data-label", "pc-meta-sqftlot").text());
//
//			}
//
//			index++;
//
//		});
//
//		index = 0;
//
//		document.getElementsByAttributeValue("data-label", "pc-brokered").stream().forEach(e -> {
//
//			properties.get(index).setBrokeredBy(e.text());
//
//			index++;
//
//		});
//
//		index = 0;
//
//		document.getElementsByAttributeValue("data-label", "pc-address").stream().forEach(e -> {
//
//			properties.get(index).setAddress(e.text());
//
//			index++;
//
//		});
//
//		index = 0;
//
//		document.getElementsByAttributeValue("data-label", "pc-address-second").stream().forEach(e -> {
//
//			properties.get(index).setSecondaryAddress(e.text());
//
//			index++;
//
//		});
//
//		return properties;
//
//	}

	public List<RealtorDotComProperty> scrapPropertyPage(Document document) {

		List<RealtorDotComProperty> properties = new ArrayList<RealtorDotComProperty>();

		RealtorDotComPropertyParser realtorDotComPropertyParser = new RealtorDotComPropertyParser();
		
		properties = realtorDotComPropertyParser.scrapPropertyPage(document);

		return properties;

	}

	public void buildUrlList() {

		this.urls = new ArrayList<URL>();

		for (int i = 1; i <= this.totalPages; i++) {

			String queryUrl = this.mainUrl + this.cityState + "pg-" + i + "/";

			try {
				urls.add(new URL(queryUrl));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public String currentPage(Document document) {

		Elements elements = document.getElementsByAttributeValue("aria-label", "pagination");

		String currentPage = "";

		for (Element e : elements) {

			if (e.getElementsByAttributeValueContaining("aria-current", "true").size() > 0) {

				Elements ele = e.getElementsByAttributeValueContaining("aria-current", "true");

				currentPage = ele.text();

			}

		}

		this.currentPage = Integer.valueOf(currentPage);

		return currentPage;

	}

	public String totalPages(Document document) {

		Elements elements = document.getElementsByAttributeValue("aria-label", "pagination");

		String totalPages = "";

		for (Element e : elements) {

			if (e.getElementsByAttributeValueContaining("aria-current", "false").size() > 0) {

				Elements ele = e.getElementsByAttributeValueContaining("aria-current", "false");

				totalPages = ele.get(ele.size() - 1).text();

			}

		}

		this.totalPages = Integer.valueOf(totalPages);

		return totalPages;

	}

	public void start() {

		setRunning(true);

		System.setProperty("jdk.httpclient.allowRestrictedHeaders", "Connection");
		System.setProperty("jdk.http.auth.proxying.disabledSchemes", "");
		System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");

		List<HttpRequest> httpRequests = new ArrayList<HttpRequest>();

		List<HttpClient> httpClients = new ArrayList<HttpClient>();

		setMainUrl("https://www.realtor.com/realestateandhomes-search/");

		csvReaderWriter = new CsvReaderWriter();
		
		super.inputStreamDecoder = new InputStreamDecoder();

		if (proxies != null) {

			for (String[] line : proxies) {

				ConnectionSettings connectionSettings = new ConnectionSettings();

				CustomHttpClient customHttpClient = new CustomHttpClient();

				connectionSettings.setProxyHost(line[0]);

				connectionSettings.setProxyPort(Integer.valueOf(line[1]));

				connectionSettings.setProxyUsername(line[2]);

				connectionSettings.setProxyPassword(line[3]);

				httpClients.add(customHttpClient.createClientWithProxy(connectionSettings));

			}

			try {
				totalNumberOfPages(httpClients.get(3), new URI(getMainUrl() + getCityState()));

				Thread.sleep(getDelayInMs());

			} catch (URISyntaxException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			buildUrlList();

			for (URL url : urls) {

				CustomHttpClient customHttpClient = new CustomHttpClient();

				try {
					httpRequests.add(customHttpClient.buildRequest(url.toURI()));
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			multiThreadedScraping(getNumberOfThreads(), httpRequests, httpClients);

		}

		if (proxies == null) {

			CustomHttpClient customHttpClient = new CustomHttpClient();

			httpClients.add(customHttpClient.createClient());

			try {
				totalNumberOfPages(httpClients.get(0), new URI(getMainUrl() + getCityState()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			buildUrlList();

			for (URL url : urls) {

				try {
					httpRequests.add(customHttpClient.buildRequest(url.toURI()));
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			singleThreadedScraping(httpRequests, httpClients);

		}

		setRunning(false);

		if (getSqliteDatabaseConnection() != null) {

			getSqliteDatabaseConnection().sessionClose();

		}

	}

	public void totalNumberOfPages(HttpClient client, URI uri) {

		CustomHttpClient customHttpClient = new CustomHttpClient();

		HttpRequest httpRequest = customHttpClient.buildRequest(uri);
		System.out.println(uri.toString());
		try {
			HttpResponse<InputStream> response = client.send(httpRequest, BodyHandlers.ofInputStream());

			response.headers().map().entrySet().stream()
					.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

			totalPages(Jsoup.parse(inputStreamWriterToString(response.body())));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<RealtorDotComProperty> htmlToPropertyMapping(String html) {

		Document document = Jsoup.parse(html);

		Elements elements = document.getElementsByAttributeValue("type", "application/json");
		
		List<RealtorDotComProperty> realtorDotComProperties = null;

		RealtorDotComProp realtorDotComProp = listOfRealtorProperty(elements.first().data());

		List<Property> properties = realtorDotComProp.getProps().getPageProps().getProperties();
		
		realtorDotComProperties = new ArrayList<RealtorDotComProperty>();

		if (properties.size() > 0) {

			for (Property property : properties) {

				RealtorDotComProperty realtorDotComProperty = new RealtorDotComProperty();

				if (property.getLocation().getAddress().getLine() != null) {

					realtorDotComProperty.setAddress(property.getLocation().getAddress().getLine());

				}

				if (property.getDescription().getBathsMax() != null) {

					realtorDotComProperty.setBaths(String.valueOf(property.getDescription().getBathsMax()));

				}

				if (property.getDescription().getBeds() != null) {

					realtorDotComProperty.setBeds(String.valueOf(property.getDescription().getBeds()));

				}

				if (property.getSource().getAgents().get(0).getOfficeName() != null) {

					realtorDotComProperty.setBrokeredBy(property.getSource().getAgents().get(0).getOfficeName());

				}

				if (property.getListPrice() != null) {

					realtorDotComProperty.setPrice(String.valueOf(property.getListPrice()));

				}

//				realtorDotComProperty.setSecondaryAddress(html);

				if (property.getDescription().getSqft() != null) {

					realtorDotComProperty.setSqft(String.valueOf(property.getDescription().getSqft()));

				}

				if (property.getDescription().getLotSqft() != null) {

					realtorDotComProperty.setSqftLot(String.valueOf(property.getDescription().getLotSqft()));

				}

				if (property.getStatus() != null) {

					realtorDotComProperty.setStatus(property.getStatus());

				}

				realtorDotComProperties.add(realtorDotComProperty);

			}

		}

		return realtorDotComProperties;

	}

	public RealtorDotComProp listOfRealtorProperty(String json) {

		RealtorDotComProp realtorDotComProp = null;

		ObjectMapper mapper = new ObjectMapper();
		
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

		try {
			realtorDotComProp = mapper.readValue(json, RealtorDotComProp.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return realtorDotComProp;

	}

	@Override
	public void scrapPageLogic(String html) {
		// TODO Auto-generated method stub

		List<RealtorDotComProperty> properties = null;

		Document document = Jsoup.parse(html);

		properties = scrapPropertyPage(document);
		
		if (properties.size() == 0) {
			
			properties = htmlToPropertyMapping(html);

		}

		if (sqliteDatabaseConnection != null) {

			for (RealtorDotComProperty realtorDotComProperty : properties) {

				sqliteDatabaseConnection.insertIntoDatabase(realtorDotComProperty);

			}

		}

		if (sqliteDatabaseConnection == null) {

			for (RealtorDotComProperty realtorDotComProperty : properties) {

				csvReaderWriter.writeArrayLineToCsv(realtorDotComProperty.fieldsValuesToArray(), getWriteToPath());

			}

		}

		houseOffersWritten += properties.size();

	}
	
	@Override
	public void parseHtmlInFileSystem() {

		String tempFolder = System.getProperty("user.home").replaceAll("\\\\", "/") + "/Realtor Property Scraper/temp/";

		File[] files = new File(tempFolder).listFiles(file -> file.getName().contains(".html"));

		if (files.length > 0) {

			for (File file : files) {

				try {

					scrapPageLogic(Jsoup.parse(file).html());

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(file.getName() + " writen.");

				file.delete();

				System.out.println("deleted.");

			}

		}

	}

}
