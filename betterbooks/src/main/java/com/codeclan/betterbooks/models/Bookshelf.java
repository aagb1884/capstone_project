package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.people.User;
import com.codeclan.betterbooks.models.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User user;

    @JsonIgnoreProperties({"bookself"})
    @OneToMany(mappedBy = "bookshelf")
    private List<BookEntry> bookEntries;

    public Bookshelf(String name, User user) {
        this.name = name;
        this.user = user;
        this.bookEntries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BookEntry> getBookEntries() {
        return bookEntries;
    }

    public void setBookEntries(List<BookEntry> bookEntries) {
        this.bookEntries = bookEntries;
    }

    public void addBookEntry(BookEntry bookEntry){
        this.bookEntries.add(bookEntry);
    }

//    public void setBookEntry(BookEntry bookEntry){
//        this.bookEntries = bookEntries;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
