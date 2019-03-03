package com.testeapigoodreads.testeapigoodreads.models;

public class GoodReads {
	
	protected String url;
	protected String key;
	private Livro q;
	
	public GoodReads() {
		
		this.url = "https://www.goodreads.com/search.xml";
		this.key = "tfVrwQ1u1TIMFVoAes5tZQ";
		this.q   = new Livro();
		
	}

	public GoodReads(String title) {
		this.url = "https://www.goodreads.com/search/index.xml";
		this.key = "tfVrwQ1u1TIMFVoAes5tZQ";
		this.q   = new Livro();
		
		q.setTitle(title);
		
	}

	public Livro getQ() {
		return q;
	}

	public void setQ(Livro q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return this.url + 
				"?key=" + this.key + 
				"&q={" + this.q.getTitle() + "}";
	}

	
}
