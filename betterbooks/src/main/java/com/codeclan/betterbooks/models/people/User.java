package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Bookshelf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class User extends Person{

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Bookshelf> bookshelves;

    public User(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }

    public List<Bookshelf> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<Bookshelf> bookshelves) {
        this.bookshelves = bookshelves;
    }
}
