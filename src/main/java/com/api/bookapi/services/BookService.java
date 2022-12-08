package com.api.bookapi.services;

import com.api.bookapi.models.BookModel;
import com.api.bookapi.repositories.BookRepository;
import jakarta.transaction.*;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public BookModel save(BookModel bookModel) {
        return this.bookRepository.save(bookModel);
    }

    public boolean existsByAuthorAndBookName(String author, String bookName) {
        return this.bookRepository.existsByAuthorAndBookName(author, bookName);
    }

}
