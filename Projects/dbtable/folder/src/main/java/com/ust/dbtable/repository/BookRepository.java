package com.ust.dbtable.repository;

import com.ust.dbtable.resource.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);

}
