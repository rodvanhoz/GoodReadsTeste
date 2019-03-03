package com.testeapigoodreads.testeapigoodreads.models;

public class Livro {
	
	private String title;
	private String author;
	private String isbn;
	
	public Livro() {

		this.title  = null;
		this.author = null;
		this.isbn   = null;
		
	}
	public Livro(String title, String author, String isbn) {
		
		this.title  = title;
		this.author = author;
		this.isbn   = isbn;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
    
}
