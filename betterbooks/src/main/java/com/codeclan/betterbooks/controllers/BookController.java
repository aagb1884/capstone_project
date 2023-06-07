package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codeclan.betterbooks.models.Book;

import java.util.List;
import java.util.Optional;

@RestController
class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/books/{id}")
    public ResponseEntity getSingleBook(@PathVariable Long id) {
        return new ResponseEntity(bookRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/books/{id}")
    public ResponseEntity<Optional> deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping(value = "/books/{id}")
    public ResponseEntity<Book> updateBook(
            @RequestBody Book book,
            @PathVariable Long id) {
        Book updatedBook = bookRepository.findById(id).get();
        updatedBook.setTitle(book.getTitle());
        updatedBook.setAuthors(book.getAuthors());
        updatedBook.setIllustrators(book.getIllustrators());
        updatedBook.setSynopsis(book.getSynopsis());
        updatedBook.setCoverUrl(book.getCoverUrl());
        updatedBook.setLengthInPages(book.getLengthInPages());
        updatedBook.setFormat(book.getFormat());
        updatedBook.setDatePublished(book.getDatePublished());
        updatedBook.setPublisher(book.getPublisher());
        updatedBook.setIsbn(book.getIsbn());
        updatedBook.setDescriptions(book.getDescriptions());

        bookRepository.save(updatedBook);

        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

        @PostMapping(value = "/books")
        public ResponseEntity<Book> createBook(@RequestBody Book book) {
            Book newBook = new Book();
            newBook.setTitle(book.getTitle());
            newBook.setAuthors(book.getAuthors());
            newBook.setIllustrators(book.getIllustrators());
            newBook.setSynopsis(book.getSynopsis());
            newBook.setCoverUrl(book.getCoverUrl());
            newBook.setLengthInPages(book.getLengthInPages());
            newBook.setFormat(book.getFormat());
            newBook.setDatePublished(book.getDatePublished());
            newBook.setPublisher(book.getPublisher());
            newBook.setIsbn(book.getIsbn());
            newBook.setDescriptions(book.getDescriptions());

            bookRepository.save(newBook);

            return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }



}
