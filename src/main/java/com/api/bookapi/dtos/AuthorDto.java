package com.api.bookapi.dtos;

import jakarta.validation.constraints.*;

public class AuthorDto {
    @NotBlank
    @Size(max = 50)
    private String author;
    @NotNull
    private int age;
    @NotBlank
    @Size(max = 20)
    private String category;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
