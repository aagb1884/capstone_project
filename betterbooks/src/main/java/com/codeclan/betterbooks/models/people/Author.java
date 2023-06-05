package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Book;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author extends Creator{

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
        super(firstname, lastname, imgUrl, bio);
    }
}
