package com.api.bookapi.repositories;

import com.api.bookapi.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface BookRepository extends JpaRepository<BookModel, UUID> {
    boolean existsByAuthorAndBookName(String author, String bookName);
    Optional<List<BookModel>> findByAuthor(String author);
}
