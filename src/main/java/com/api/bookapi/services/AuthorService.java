package com.api.bookapi.services;

import com.api.bookapi.models.AuthorModel;
import com.api.bookapi.repositories.AuthorRepository;
import jakarta.transaction.Transactional;

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
}
