package com.api.bookapi.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table()
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 50)
    private String author;
    @Column(nullable = false, unique = true, length = 50)
    private String bookName;
    @Column(nullable = false, length = 20)
    private String category;
    @Column(nullable = false)
    private int pageQty;
    @Column(nullable = false)
    private int releaseYear;

}
