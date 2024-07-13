package com.graphql.goal;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoalApplication.class, args);
	}
	
	@Bean 
	ApplicationRunner applcationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args->{
			Author elon = authorRepository.save(new Author(null,"elon"));
			Author mark = authorRepository.save(new Author(null, "mark"));
			bookRepository.saveAll(List.of(
					new Book("js in 2024",elon,"javascript"),
					new Book("advance java",mark,"java"),
					new Book("learn basic of AI",elon,"machine learning")
					));
			
		};
		
	}

}
