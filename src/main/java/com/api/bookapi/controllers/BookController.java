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
        } else if (bookDto.getReleaseYear() > 2023 || bookDto.getReleaseYear() <= 0) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Incorrect release year!");
        } else if (bookDto.getPageQty() <= 0) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Your book must have pages!");
        }
        var bookModel = new BookModel();
        BeanUtils.copyProperties(bookDto, bookModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(bookModel));
    }
}
