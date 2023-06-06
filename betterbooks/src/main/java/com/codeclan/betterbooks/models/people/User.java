package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Bookshelf;
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
    private List<Bookshelf> bookshelves;

    public User() {
    }

    public User(String firstname, String lastname, String imgUrl, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.imgUrl = imgUrl;
        this.bio = bio;
        this.bookshelves = new ArrayList<Bookshelf>();
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

    public List<Bookshelf> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<Bookshelf> bookshelves) {
        this.bookshelves = bookshelves;
    }
}
