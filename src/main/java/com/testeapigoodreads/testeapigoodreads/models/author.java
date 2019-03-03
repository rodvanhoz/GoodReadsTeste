package com.testeapigoodreads.testeapigoodreads.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "author")
@XmlAccessorType (XmlAccessType.FIELD)
public class author {
	
	private int id;
	private String name;
	
	
	public author() {
		super();
	}

	public author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
