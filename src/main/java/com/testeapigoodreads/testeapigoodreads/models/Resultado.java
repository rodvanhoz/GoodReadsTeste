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
	
	private long idlivro;
	private String titulo;
	private String author;	
	private String urlimg;
	private String palavrachave;
	private String catalogado;
	
	public Resultado() {
		this.idlivro = 0;
		this.titulo = null;
		this.author = null;
		this.urlimg = null;
		this.palavrachave = null;
	}

	public Resultado(String titulo, String author, String urlimg, long idlivro, String palavrachave, String catalogado) {
		
		this.titulo = titulo;
		this.author = author;
		this.urlimg = urlimg;
		this.idlivro = idlivro;
		this.palavrachave = palavrachave;
		this.catalogado = catalogado;
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

	public long getIdlivro() {
		return idlivro;
	}

	public void setIdlivro(long idlivro) {
		this.idlivro = idlivro;
	}

	public String getPalavrachave() {
		return palavrachave;
	}

	public void setPalavrachave(String palavrachave) {
		this.palavrachave = palavrachave;
	}

	public String getCatalogado() {
		return catalogado;
	}

	public void setCatalogado(String catalogado) {
		this.catalogado = catalogado;
	}
	
}
