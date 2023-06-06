package com.codeclan.betterbooks.models;


import com.codeclan.betterbooks.models.people.User;

import javax.persistence.*;


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
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String startedReading;
    private String finishedReading;
    private Integer starRating;
    private Status status;

    public BookEntry() {
    }

    public BookEntry(Book book, User user, String startedReading, String finishedReading, Integer starRating, Status status) {
        this.book = book;
        this.user = user;
        this.startedReading = startedReading;
        this.finishedReading = finishedReading;
        this.starRating = starRating;
        this.status = status;
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

    public String getStartedReading() {
        return startedReading;
    }

    public void setStartedReading(String startedReading) {
        this.startedReading = startedReading;
    }

    public String getFinishedReading() {
        return finishedReading;
    }

    public void setFinishedReading(String finishedReading) {
        this.finishedReading = finishedReading;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
