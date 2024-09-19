package com.ust.dbtable;

import com.ust.dbtable.repository.BookRepository;
import com.ust.dbtable.repository.PageRepository;
import com.ust.dbtable.resource.Book;
import com.ust.dbtable.resource.Page;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DbtableApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbtableApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(BookRepository bookRepository, PageRepository pageRepository){
		return args -> {
			Book book = new Book ("Spring Boot", "Josh Lang", "8735");
			Page p1 = new Page(1, "Introduction", "Beautiful Spring");
			Page p2 = new Page(65, "Java 8 contents", "Java 8 Lambda");
			Page p3 = new Page(95, "Concurrency", "Virtual Threads");

			book.getPages().add(p1);
			book.getPages().add(p2);
			book.getPages().add(p3);

			bookRepository.save(book);

		};
	}
}
