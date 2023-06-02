package com.codeclan.betterbooks.models.people;

import com.codeclan.betterbooks.models.Bookshelf;

import java.util.ArrayList;

public class User extends Person{

    private ArrayList<Bookshelf> bookshelves;

    public User(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }

    public ArrayList<Bookshelf> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(ArrayList<Bookshelf> bookshelves) {
        this.bookshelves = bookshelves;
    }
}
