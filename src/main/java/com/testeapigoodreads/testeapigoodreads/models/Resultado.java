package com.testeapigoodreads.testeapigoodreads.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resultado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
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
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
