package com.codeclan.betterbooks.models.people;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.ArrayList;



public abstract class Creator extends Person{




    private ArrayList<Book> books;


    public Creator(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
