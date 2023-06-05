package com.codeclan.betterbooks.models;

import java.awt.print.Book;
import java.util.ArrayList;

public class Bookshelf {

    private String name;
    private ArrayList<Book> books;

    public Bookshelf(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBookToBookshelf(){

    }
}
