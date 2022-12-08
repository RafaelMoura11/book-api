package com.api.bookapi.controllers;

import com.api.bookapi.dtos.BookDto;
import com.api.bookapi.models.BookModel;
import com.api.bookapi.services.BookService;
import jakarta.validation.*;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/books")
public class BookController {
    final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Object> saveBook(@RequestBody @Valid BookDto bookDto){
        if (bookService.existsByAuthorAndBookName(bookDto.getAuthor(), bookDto.getBookName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Book already exists!");
        }
        var bookModel = new BookModel();
        BeanUtils.copyProperties(bookDto, bookModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(bookModel));
    }
}
