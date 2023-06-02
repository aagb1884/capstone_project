package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.people.Creator;
import java.time.LocalDate;

import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Creator> creators;
    private String synopsis;
    private ArrayList<DescriptiveTag> descriptions;
    private int lengthInPages;
    private String format;
    private LocalDate datePublished;
    private String publisher;
    private int isbn;
    private String coverUrl;

    public Book(String title, ArrayList<Creator> creators, String synopsis, ArrayList<DescriptiveTag> descriptions,
                int lengthInPages, String format, LocalDate datePublished, String publisher, int isbn, String coverUrl) {
        this.title = title;
        this.creators = creators;
        this.synopsis = synopsis;
        this.descriptions = descriptions;
        this.lengthInPages = lengthInPages;
        this.format = format;
        this.datePublished = datePublished;
        this.publisher = publisher;
        this.isbn = isbn;
        this.coverUrl = coverUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Creator> getCreators() {
        return creators;
    }

    public void setCreators(ArrayList<Creator> creators) {
        this.creators = creators;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public ArrayList<DescriptiveTag> getDescriptions() {
        return descriptions;
    }


    public int getLengthInPages() {
        return lengthInPages;
    }

    public void setLengthInPages(int lengthInPages) {
        this.lengthInPages = lengthInPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }
}
