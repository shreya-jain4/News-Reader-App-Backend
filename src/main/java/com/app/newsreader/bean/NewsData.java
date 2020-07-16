package com.app.newsreader.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
/*
 * @JsonPropertyOrder({ "status", "totalResults", "articles" })
 */
public class NewsData {

	/*
	 * @JsonProperty("status") private String status;
	 * 
	 * @JsonProperty("totalResults") private Integer totalResults;
	 */
    @JsonProperty("articles")
    private List<Article> articles = null;

	/*
	 * @JsonIgnore private Map<String, Object> additionalProperties = new
	 * HashMap<String, Object>();
	 * 
	 * @JsonProperty("status") public String getStatus() { return status; }
	 * 
	 * @JsonProperty("status") public void setStatus(String status) { this.status =
	 * status; }
	 * 
	 * @JsonProperty("totalResults") public Integer getTotalResults() { return
	 * totalResults; }
	 * 
	 * @JsonProperty("totalResults") public void setTotalResults(Integer
	 * totalResults) { this.totalResults = totalResults; }
	 */
    @JsonProperty("articles")
    public List<Article> getArticles() {
        return articles;
    }

    @JsonProperty("articles")
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

	/*
	 * @JsonAnyGetter public Map<String, Object> getAdditionalProperties() { return
	 * this.additionalProperties; }
	 * 
	 * @JsonAnySetter public void setAdditionalProperty(String name, Object value) {
	 * this.additionalProperties.put(name, value); }
	 */
}