package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "illustrators")
public class Illustrator{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String imgUrl;
    @Column
    private String bio;

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
        this.firstname = firstname;
        this.lastname = lastname;
        this.imgUrl = imgUrl;
        this.bio = bio;
        this.books = new ArrayList<Book>();
    }

    public Illustrator(){

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
