package com.app.newsreader.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.newsreader.bean.NewsData;

@Service
public class NewsReaderService {


private static final String apiKey = "c4cbc1e47ae34e4da48577668284714b";
private static String url = "https://newsapi.org/v2/top-headlines?apiKey=API_KEY_TO_REPLACE&country=COUNTRY_TO_REPLACE&category=CATEGORY_TO_REPLACE";

public NewsData getNews(String country, String category) {
	final String uri = url.replace("API_KEY_TO_REPLACE", apiKey).replace("COUNTRY_TO_REPLACE", country)
			.replace("CATEGORY_TO_REPLACE", category);

	RestTemplate restTemplate = new RestTemplate();
	NewsData result = restTemplate.getForObject(uri, NewsData.class);

	return result;

}

public NewsData getNewsSample() {

	String country = "au";
	String category = "sports";
	final String uri = url.replace("API_KEY_TO_REPLACE", apiKey).replace("COUNTRY_TO_REPLACE", country)
			.replace("CATEGORY_TO_REPLACE", category);

	RestTemplate restTemplate = new RestTemplate();
	NewsData result = restTemplate.getForObject(uri, NewsData.class);

	return result;

}
}