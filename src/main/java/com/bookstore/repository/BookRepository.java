package com.bookstore.repository;


import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long>{
    Book findAllById(Long id);

    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);
}
