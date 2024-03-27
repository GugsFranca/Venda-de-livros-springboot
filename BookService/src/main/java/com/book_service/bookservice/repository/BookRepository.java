package com.book_service.bookservice.repository;

import com.book_service.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{}