package com.testeapigoodreads.testeapigoodreads.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Book")
@XmlAccessorType (XmlAccessType.FIELD)
public class Book {
	
	private int id;
	private String tittle;
	
	@XmlElement (name = "author")
	private List<author> author;
	private String image_url;
	private String small_image_url;

	
	public Book() {
		super();
	}

	public Book(int id, String tittle, com.testeapigoodreads.testeapigoodreads.models.author author, String image_url,
			String small_image_url) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.author = new List<author>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<com.testeapigoodreads.testeapigoodreads.models.author> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public com.testeapigoodreads.testeapigoodreads.models.author set(int index,
					com.testeapigoodreads.testeapigoodreads.models.author element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public com.testeapigoodreads.testeapigoodreads.models.author remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<com.testeapigoodreads.testeapigoodreads.models.author> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<com.testeapigoodreads.testeapigoodreads.models.author> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<com.testeapigoodreads.testeapigoodreads.models.author> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public com.testeapigoodreads.testeapigoodreads.models.author get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends com.testeapigoodreads.testeapigoodreads.models.author> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends com.testeapigoodreads.testeapigoodreads.models.author> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, com.testeapigoodreads.testeapigoodreads.models.author element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(com.testeapigoodreads.testeapigoodreads.models.author e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		this.image_url = image_url;
		this.small_image_url = small_image_url;
	}

	public List<author> getAuthor() {
		return author;
	}

	public void setAuthor(List<author> author) {
		this.author = author;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getSmall_image_url() {
		return small_image_url;
	}

	public void setSmall_image_url(String small_image_url) {
		this.small_image_url = small_image_url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	
}
