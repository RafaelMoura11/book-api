package com.api.bookapi.repositories;

import com.api.bookapi.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
    boolean existsByName(String name);
}
