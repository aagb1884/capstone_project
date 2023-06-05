package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "illustrators")
public class Illustrator extends Creator{

    @JsonIgnoreProperties({"illustrators"})
    @ManyToMany
    @JoinTable(
            name = "illustrators_books",
            joinColumns = {
                    @JoinColumn(
                            name = "illustrator_id",
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

    public Illustrator(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }
}
