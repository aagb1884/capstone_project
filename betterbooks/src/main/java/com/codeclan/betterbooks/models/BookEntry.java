package com.codeclan.betterbooks.models;


import com.codeclan.betterbooks.models.people.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @JsonIgnoreProperties({"myBooks"})
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(name = "started_reading")
    private String startedReading;
    @Column(name = "finished_reading")
    private String finishedReading;
    @Column(name = "star_rating")
    private Integer starRating;
    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
    @Column(length = 500)
    private String review;

    public BookEntry() {
    }

    public BookEntry(Book book, User user, String startedReading, String finishedReading, Integer starRating, Status status, String review) {
        this.book = book;
        this.user = user;
        this.startedReading = startedReading;
        this.finishedReading = finishedReading;
        this.starRating = starRating;
        this.status = status;
        this.review = review;
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
