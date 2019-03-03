package com.testeapigoodreads.testeapigoodreads.models;

public class Resultado {

	private String titulo;
	private String author;	
	private String urlimg;
	
	public Resultado() {
		this.titulo = null;
		this.author = null;
		this.urlimg = null;
	}

	public Resultado(String titulo, String author, String urlimg) {
		this.titulo = titulo;
		this.author = author;
		this.urlimg = urlimg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUrlimg() {
		return urlimg;
	}

	public void setUrlimg(String urlimg) {
		this.urlimg = urlimg;
	}
	
	
}
