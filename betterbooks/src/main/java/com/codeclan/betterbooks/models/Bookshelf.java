package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private String name;
    @JsonIgnoreProperties({"bookshelf"})
    @OneToMany(mappedBy = "bookshelf")
    private List<Book> books;

    public Bookshelf(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBookToBookshelf(Book book){
        this.books.add(book);
    }
}
