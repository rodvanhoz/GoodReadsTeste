package com.testeapigoodreads.testeapigoodreads.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Work")
@XmlAccessorType (XmlAccessType.FIELD)
public class Work {
	
	private int id;
	private int books_count;
	private int ratings_count;
	private int text_reviews_count;
	private int original_publication_year;
	private int original_publication_month;
	private int original_publication_day;
	
	private String average_rating;
	
	@XmlElementWrapper
	private java.util.List<Book> best_book;
	
	public int getId() {
		return id;
	}

	
	public Work() {
		super();
	}

	public Work(int id, int books_count, int ratings_count, int text_reviews_count, int original_publication_year,
			int original_publication_month, int original_publication_day, String average_rating, java.util.List<Book> best_book) {
		super();
		this.id = id;
		this.books_count = books_count;
		this.ratings_count = ratings_count;
		this.text_reviews_count = text_reviews_count;
		this.original_publication_year = original_publication_year;
		this.original_publication_month = original_publication_month;
		this.original_publication_day = original_publication_day;
		this.average_rating = average_rating;
		this.best_book = new java.util.List<Book>() {
			
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
			public java.util.List<Book> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Book set(int index, Book element) {
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
			public Book remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<Book> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<Book> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<Book> iterator() {
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
			public Book get(int index) {
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
			public boolean addAll(int index, Collection<? extends Book> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends Book> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, Book element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(Book e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBooks_count() {
		return books_count;
	}

	public void setBooks_count(int books_count) {
		this.books_count = books_count;
	}

	public int getRatings_count() {
		return ratings_count;
	}

	public void setRatings_count(int ratings_count) {
		this.ratings_count = ratings_count;
	}

	public int getText_reviews_count() {
		return text_reviews_count;
	}

	public void setText_reviews_count(int text_reviews_count) {
		this.text_reviews_count = text_reviews_count;
	}

	public int getOriginal_publication_year() {
		return original_publication_year;
	}

	public void setOriginal_publication_year(int original_publication_year) {
		this.original_publication_year = original_publication_year;
	}

	public int getOriginal_publication_month() {
		return original_publication_month;
	}

	public void setOriginal_publication_month(int original_publication_month) {
		this.original_publication_month = original_publication_month;
	}

	public int getOriginal_publication_day() {
		return original_publication_day;
	}

	public void setOriginal_publication_day(int original_publication_day) {
		this.original_publication_day = original_publication_day;
	}

	public String getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}
	public java.util.List<Book> getBest_book() {
		return best_book;
	}
	public void setBest_book(java.util.List<Book> best_book) {
		this.best_book = best_book;
	}

	
	
}
