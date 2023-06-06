package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.models.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
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
    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<BookEntry> myBooks;

    public User() {
    }

    public User(String firstname, String lastname, String imgUrl, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.imgUrl = imgUrl;
        this.bio = bio;
        this.myBooks = new ArrayList<BookEntry>();
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

    public List<BookEntry> getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(List<BookEntry> myBooks) {
        this.myBooks = myBooks;
    }
    public void addBookEntry(BookEntry bookEntry){
        this.myBooks.add(bookEntry);
    }
}
