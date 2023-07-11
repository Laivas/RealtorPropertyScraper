package scrapperModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

public class RealtorDotComPropertyParser {
	
	private int index;
	
	
	public List<RealtorDotComProperty> scrapPropertyPage(Document document) {
		
		List<RealtorDotComProperty> properties = new ArrayList<RealtorDotComProperty>();

		document.getElementsByAttributeValue("data-label", "pc-price").forEach(e -> {

			RealtorDotComProperty property = new RealtorDotComProperty();

			property.setPrice(e.text());

			properties.add(property);

		});

		index = 0;

		document.getElementsByAttributeValueContaining("class", "statusText").forEach(e -> {

			properties.get(index).setStatus(e.text());

			index++;

		});

		index = 0;

		document.getElementsByAttributeValue("data-testid", "property-meta-container").forEach(e -> {

			if (e.getElementsByAttributeValue("data-label", "pc-meta-beds").size() > 0) {

				properties.get(index).setBeds(e.getElementsByAttributeValue("data-label", "pc-meta-beds").text());

			}

			if (e.getElementsByAttributeValue("data-label", "pc-meta-baths").size() > 0) {

				properties.get(index).setBaths(e.getElementsByAttributeValue("data-label", "pc-meta-baths").text());

			}

			if (e.getElementsByAttributeValue("data-label", "pc-meta-sqft").size() > 0) {

				properties.get(index).setSqft(e.getElementsByAttributeValue("data-label", "pc-meta-sqft").text());

			}

			if (e.getElementsByAttributeValue("data-label", "pc-meta-sqftlot").size() > 0) {

				properties.get(index).setSqftLot(e.getElementsByAttributeValue("data-label", "pc-meta-sqftlot").text());

			}

			index++;

		});

		index = 0;

		document.getElementsByAttributeValue("data-label", "pc-brokered").forEach(e -> {

			properties.get(index).setBrokeredBy(e.text());

			index++;

		});

		index = 0;

		document.getElementsByAttributeValue("data-label", "pc-address").forEach(e -> {

			properties.get(index).setAddress(e.text());

			index++;

		});

		index = 0;

		document.getElementsByAttributeValue("data-label", "pc-address-second").forEach(e -> {

			properties.get(index).setSecondaryAddress(e.text());

			index++;

		});

		return properties;

	}


}
