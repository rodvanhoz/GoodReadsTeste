package com.testeapigoodreads.testeapigoodreads.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	private long IdLivro;
	private String titulo;
	private String author;	
	private String urlimg;
	private String palavrachave;
	
	public Livros() {
		this.IdLivro = 0;
		this.titulo = null;
		this.author = null;
		this.urlimg = null;
		this.palavrachave = null;
	}

	public Livros(String titulo, String author, String urlimg, long IdLivro, String palavrachave) {
		
		this.titulo = titulo;
		this.author = author;
		this.urlimg = urlimg;
		this.IdLivro = IdLivro;
		this.palavrachave = palavrachave;
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
		return IdLivro;
	}

	public void setIdlivro(long idlivro) {
		this.IdLivro = idlivro;
	}

	public String getPalavrachave() {
		return palavrachave;
	}

	public void setPalavrachave(String palavrachave) {
		this.palavrachave = palavrachave;
	}
	
}
