package com.api.bookapi.services;

import com.api.bookapi.models.AuthorModel;
import com.api.bookapi.models.BookModel;
import com.api.bookapi.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public AuthorModel save(AuthorModel authorModel) {
        return this.authorRepository.save(authorModel);
    }

    public boolean existsByName(String name) {
        return this.authorRepository.existsByName(name);
    }

    public List<AuthorModel> findAll() {
        return this.authorRepository.findAll();
    }
}
