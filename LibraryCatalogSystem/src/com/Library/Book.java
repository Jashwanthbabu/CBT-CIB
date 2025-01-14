package com.Library;

public class Book {
	private int id;
	private String title;
	private int year;
	private String author;
	public Book(int id, String title, int year, String author) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", year=" + year + ", author=" + author + "]";
	}
	
	

}