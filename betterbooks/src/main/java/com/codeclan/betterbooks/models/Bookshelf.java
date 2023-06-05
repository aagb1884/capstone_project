package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.people.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private String name;
    @JsonIgnoreProperties({"bookshelf"})
    @OneToMany(mappedBy = "bookshelf")
    private List<Book> books;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User user;

    public Bookshelf(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.user = user;
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
