package com.codeclan.betterbooks.models;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "book_entries")
public class BookEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne
    @JoinColumn(name = "bookshelf_id", nullable = false)
    private Bookshelf bookshelf;
    private LocalDate startedReading;
    private LocalDate finishedReading;
    private double starRating;

    public BookEntry() {
    }

    public BookEntry(Book book, Bookshelf bookshelf, LocalDate startedReading, LocalDate finishedReading, double starRating) {
        this.book = book;
        this.bookshelf = bookshelf;
        this.startedReading = startedReading;
        this.finishedReading = finishedReading;
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }

    public void setBookshelf(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    public LocalDate getStartedReading() {
        return startedReading;
    }

    public void setStartedReading(LocalDate startedReading) {
        this.startedReading = startedReading;
    }

    public LocalDate getFinishedReading() {
        return finishedReading;
    }

    public void setFinishedReading(LocalDate finishedReading) {
        this.finishedReading = finishedReading;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }


}
