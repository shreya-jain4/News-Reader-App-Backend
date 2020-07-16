package com.app.newsreader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.newsreader.bean.Article;
import com.app.newsreader.service.NewsReaderService;

@RestController
public class NewsReaderController {

	@Autowired
	NewsReaderService newsReaderService;
	
	@GetMapping("/getNews")
	public List<Article> getNews(@RequestParam String country, @RequestParam String category) {

		return newsReaderService.getNews(country, category).getArticles();
	}
}
