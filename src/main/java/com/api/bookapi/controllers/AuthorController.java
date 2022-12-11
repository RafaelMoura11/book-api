package com.api.bookapi.controllers;

import com.api.bookapi.dtos.AuthorDto;
import com.api.bookapi.models.AuthorModel;
import com.api.bookapi.services.AuthorService;
import jakarta.validation.*;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/authors")
public class AuthorController {
    final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<Object> saveAuthor(@RequestBody @Valid AuthorDto authorDto){
        var authorModel = new AuthorModel();
        BeanUtils.copyProperties(authorDto, authorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.save(authorModel));
    }
}
