package com.hanna.books.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.*; 

@Entity
@Table (name = "book")
public class Book {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)                private Integer bookId;
    @Column(name="isbn")													private String isbn;
    @Column(name="title")                                                  	private String title;
    @Column(name="author")                                             		private String author;
    @Column(name="theme")                                            		private String theme;
    @Column(name="publishedAt")                                          	private long publishedAt;

    public Book() { }
    public Book(String isbn, String title, String author, String theme/*, long publishedAt*/)
    {
        
    	this.isbn = isbn;
    	this.title = title;
        this.author = author;
        this.theme = theme;
        this.publishedAt = Instant.now().toEpochMilli();
    }
	public Integer getBookId() {
		return bookId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public long getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(long publishedAt) {
		this.publishedAt = publishedAt;
	}
}