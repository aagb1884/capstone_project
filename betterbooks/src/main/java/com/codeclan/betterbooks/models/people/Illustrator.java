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
    @Column(length = 500)
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
    public void addIllustratorBook(Book book){
        this.books.add(book);
    }

    public void removeIllustratorBook(Book book){
        this.books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
