package com.testeapigoodreads.testeapigoodreads.models;

public class GoodReads {
	
	protected String url;
	protected String key;
	protected String Title;
	
	public GoodReads() {
		
		this.url = "https://www.goodreads.com/search.xml";
		this.key = "tfVrwQ1u1TIMFVoAes5tZQ";
		
	}

	public GoodReads(String title) {
		this.url = "https://www.goodreads.com/search/index.xml";
		this.key = "tfVrwQ1u1TIMFVoAes5tZQ";
		this.Title = title;
		
	}

	@Override
	public String toString() {
		return this.url + 
				"?key=" + this.key + 
				"&q={" + this.Title + "}";
	}

}
