package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @ManyToMany
    @JoinTable(
            name = "authors_books",
            joinColumns = {
                    @JoinColumn(
                            name = "book_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "author_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Author> authors;
    @ManyToMany
    @JoinTable(
            name = "illustrators_books",
            joinColumns = {
                    @JoinColumn(
                            name = "book_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "illustrator_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Illustrator> illustrators;
    @Column
    private String synopsis;
    @Column
    private ArrayList<DescriptiveTag> descriptions;
    @Column(name = "length_in_pages")
    private int lengthInPages;
    @Column
    private String format;
    @Column(name = "date_published")
    private LocalDate datePublished;
    @Column
    private String publisher;
    @Column
    private String isbn;
    @Column(name = "cover_url")
    private String coverUrl;
    @JsonIgnoreProperties({"book"})
    @OneToMany(mappedBy = "book")
    private List<BookEntry> bookEntries;

    public Book(String title, String synopsis, int lengthInPages, String format,
                LocalDate datePublished, String publisher, String isbn, String coverUrl) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.illustrators = new ArrayList<>();
        this.synopsis = synopsis;
        this.descriptions = new ArrayList<>();
        this.lengthInPages = lengthInPages;
        this.format = format;
        this.datePublished = datePublished;
        this.publisher = publisher;
        this.isbn = isbn;
        this.coverUrl = coverUrl;
        this.bookEntries = new ArrayList<>();

    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

   public void addAuthors(Author author){
        this.authors.add(author);
   }

    public List<Illustrator> getIllustrators() {
        return illustrators;
    }

    public void setIllustrators(List<Illustrator> illustrators) {
        this.illustrators = illustrators;
    }

    public void addIllustrators(Illustrator illustrator){
        this.illustrators.add(illustrator);
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

    public void setDescriptions(ArrayList<DescriptiveTag> descriptions) {
        this.descriptions = descriptions;
    }

    public void addDescriptions(DescriptiveTag descriptiveTag){
        this.descriptions.add(descriptiveTag);
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public List<BookEntry> getBookEntries() {
        return bookEntries;
    }

    public void setBookEntries(List<BookEntry> bookEntries) {
        this.bookEntries = bookEntries;
    }

    //    public void deleteAuthorFromBook(){
//
//    }
//
//    public void deleteIllustratorFromBook(){
//
//    }
}
