package com.codeclan.betterbooks.models;

import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;

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
    @Column(length = 500)
    private String synopsis;
    @Column
    private ArrayList<DescriptiveTag> descriptions;
    @Column(name = "length_in_pages")
    private int lengthInPages;
    @Column
    private Format format;
    @Column(name = "date_published")
    private String datePublished;
    @Column
    private String publisher;
    @Column
    private String isbn;
    @Column(name = "cover_url")
    private String coverUrl;
    @Column(name = "average_rating")
    private Double averageRating;
    @JsonIgnoreProperties({"book"})
    @OneToMany(mappedBy = "book")
    private List<BookEntry> bookEntries;

    public Book(String title, String synopsis, int lengthInPages, Format format,
                String datePublished, String publisher, String isbn, String coverUrl, Double averageRating) {
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
        this.averageRating = averageRating;
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

   public void addAuthor(Author author){
        this.authors.add(author);
   }

   public void removeAuthor(Author author){ this.authors.remove(author);}

    public List<Illustrator> getIllustrators() {
        return illustrators;
    }

    public void setIllustrators(List<Illustrator> illustrators) {
        this.illustrators = illustrators;
    }

    public void addIllustrator(Illustrator illustrator){
        this.illustrators.add(illustrator);
    }

    public void removeIllustrator(Illustrator illustrator){ this.illustrators.remove(illustrator);}
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

    public void addDescription(DescriptiveTag descriptiveTag){
        this.descriptions.add(descriptiveTag);
    }
    public void removeDescription(DescriptiveTag descriptiveTag){
        this.descriptions.remove(descriptiveTag);
    }
    public int getLengthInPages() {
        return lengthInPages;
    }

    public void setLengthInPages(int lengthInPages) {
        this.lengthInPages = lengthInPages;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
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

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
    public void addBookEntry(BookEntry bookEntry){
        this.bookEntries.add(bookEntry);
    }
    public void removeBookEntry(BookEntry bookEntry){
        this.bookEntries.remove(bookEntry);
    }
}
