package com.graphql.goal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy="author", cascade=CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	private Integer age;
	
	public Author(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Author() {};
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public Integer getAge() {
		return age;
	}
}
