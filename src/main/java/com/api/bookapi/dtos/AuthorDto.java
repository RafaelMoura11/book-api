package com.api.bookapi.dtos;

import jakarta.validation.constraints.*;

public class AuthorDto {
    @NotBlank
    @Size(max = 50)
    private String name;
    @NotNull
    private int age;
    @NotBlank
    @Size(max = 20)
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void getNationality(String nationality) {
        this.nationality = nationality;
    }
}
