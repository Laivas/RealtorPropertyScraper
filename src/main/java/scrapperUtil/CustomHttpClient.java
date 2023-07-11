package scrapperUtil;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.URI;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.InetSocketAddress;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.security.NoSuchAlgorithmException;


import javax.net.ssl.SSLContext;


import scrapperModel.CustomHeader;

public class CustomHttpClient {
	
//	private ConnectionSettings connectionSettings;
	
	
	public HttpClient createClientWithProxy(ConnectionSettings connectionSettings) {
		
		HttpClient httpClient = null;
		
		CookieManager cookieManager = new CookieManager();

		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		
		try {
			httpClient = HttpClient
					.newBuilder()
					.authenticator(new Authenticator() {

						@Override
						protected PasswordAuthentication getPasswordAuthentication() {

							if (getRequestorType().equals(RequestorType.PROXY)) {

								return getPasswordAuthentication(getRequestingHost(), getRequestingPort());

							} else {

								return null;

							}

						}

						protected PasswordAuthentication getPasswordAuthentication(String host, int port) {

							if (connectionSettings.getProxyHost().equals(host) && connectionSettings.getProxyPort() == port) {

								return new PasswordAuthentication(connectionSettings.getProxyUsername(),
										connectionSettings.getProxyPassword().toCharArray());

							} else

								return null;
						}
						
					})
					.cookieHandler(cookieManager)
					.proxy(ProxySelector.of(new InetSocketAddress(connectionSettings.getProxyHost(),connectionSettings.getProxyPort())))
					.followRedirects(HttpClient.Redirect.NORMAL)
//					.connectTimeout(Duration.ofSeconds(30))
					.sslContext(SSLContext.getDefault())
//					.sslParameters(new SSLParameters())
					.version(HttpClient.Version.HTTP_2)
					.build();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return httpClient;
		
	}
	
	public HttpClient createClient() {
		
		HttpClient httpClient = null;
		
		CookieManager cookieManager = new CookieManager();
		
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		
		try {
			httpClient = HttpClient
					.newBuilder()
					.cookieHandler(cookieManager)
					.followRedirects(HttpClient.Redirect.NORMAL)
//					.connectTimeout(Duration.ofSeconds(10))
					.sslContext(SSLContext.getDefault())
//					.sslParameters(new SSLParameters())
					.version(HttpClient.Version.HTTP_2)
					.build();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return httpClient;
		
	}
	

//	public HttpRequest buildRequest(URI uri) {
//		
//		CustomHeader customHeader = new CustomHeader();
//		
//		HttpRequest httpRequest = HttpRequest.newBuilder(uri)
//				.header("sec-ch-ua", customHeader.getSecchua())
//				.header("sec-ch-ua-mobile", customHeader.getSecchuamobile())
//				.header("sec-ch-ua-platform", customHeader.getSecchuaplatform())
//				.header("sec-fetch-dest", customHeader.getSecfetchdest())
//				.header("sec-fetch-mode", customHeader.getSecfetchmode())
//				.header("sec-fetch-site", customHeader.getSecfetchsite())
//				.header("upgrade-insecure-requests", customHeader.getUpgradeinsecurerequests())
//				.header("user-agent", customHeader.getUseragent())
////				.header("authority" , customHeader.getAuthority())
//				.header("method", customHeader.getMethod())
////				.header("path", customHeader.getPath())
//				.header("scheme", customHeader.getScheme())
//				.header("accept", customHeader.getAccept())
//				.header("accept-encoding", customHeader.getAcceptencoding())
//				.header("accept-language", customHeader.getAcceptlanguage())
//				.header("cache-control", customHeader.getCachecontrol())
//				.header("connection", customHeader.getConnection())
//				.header("keep-alive", customHeader.getKeepAlive())
//				.header("pragma", customHeader.getPragma())
////				.header("referer", customHeader.getReferer())
//				.GET()
//				.build();
//		
//		return httpRequest;
//		
//	}
	public HttpRequest buildRequest(URI uri) {

		CustomHeader customHeader = new CustomHeader();
		
		HttpRequest httpRequest = HttpRequest.newBuilder(uri)
				.header("Authority", customHeader.getAuthority())
				.header("Method", customHeader.getMethod())
				.header("Path", uri.getPath())
				.header("Scheme", customHeader.getScheme())
				.header("Accept", customHeader.getAccept())
				.header("Accept-Encoding", customHeader.getAcceptEncoding())
				.header("Accept-Language", customHeader.getAcceptLanguage())
				.header("Cache-Control", customHeader.getCacheControl())
//				.header("", null)
				.header("Sec-Ch-Ua", customHeader.getSecChUa())
				.header("Sec-Ch-Ua-Mobile", customHeader.getSecChUaMobile())
				.header("Sec-Ch-Ua-Platform", customHeader.getSecChUaPlatform())
				.header("Sec-Fetch-Dest", customHeader.getSecFetchDest())
				.header("Sec-Fetch-Mode", customHeader.getSecFetchMode())
				.header("Sec-Fetch-Site", customHeader.getSecFetchSite())
				.header("Sec-Fetch-User", customHeader.getSecFetchUser())
				.header("Upgrade-Insecure-Requests", customHeader.getUpgradeInsecureRequests())
				.header("User-Agent", customHeader.getUserAgent())
				.GET()
				.build();
		
		return httpRequest;
		
	}

}
