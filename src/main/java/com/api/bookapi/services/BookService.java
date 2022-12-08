package com.api.bookapi.services;

import com.api.bookapi.repositories.BookRepository;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
