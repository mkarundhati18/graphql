package com.graphql.goal;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String publisher;
	@ManyToOne(fetch=FetchType.LAZY)
	private Author author ;
	
	public Book(String name,Author author,String publisher) {
		this.name = name;
		this.author= author;
		this.publisher=publisher;
	}
	public Book() {}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPublisher() {
		return publisher;
	}
	public Author getAuthor() {
		return author;
	};

}
