package com.api.bookapi.dtos;

import jakarta.validation.constraints.*;

public class BookDto {
    @NotBlank
    @Size(max = 50)
    private String author;
    @NotBlank
    @Size(max = 50)
    private String bookName;
    @NotBlank
    @Size(max = 20)
    private String category;
    @NotBlank
    private int pageQty;
    @NotBlank
    private int releaseYear;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPageQty() {
        return pageQty;
    }

    public void setPageQty(int pageQty) {
        this.pageQty = pageQty;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
