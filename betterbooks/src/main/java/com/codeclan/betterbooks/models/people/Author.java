package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Book;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author{
    @Id
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String imgUrl;
    @Column
    private String bio;

    @JsonIgnoreProperties({"authors"})
    @ManyToMany
    @JoinTable(
            name = "authors_books",
            joinColumns = {
                    @JoinColumn(
                            name = "author_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "book_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Book> books;

    public Author(String firstname, String lastname, String imgUrl, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.imgUrl = imgUrl;
        this.bio = bio;
        this.books = new ArrayList<>();
    }

    public Author() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
