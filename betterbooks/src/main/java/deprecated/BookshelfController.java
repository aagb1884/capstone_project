//package com.codeclan.betterbooks.controllers;
//
//import com.codeclan.betterbooks.models.Book;
//import com.codeclan.betterbooks.models.Bookshelf;
//import com.codeclan.betterbooks.models.people.Author;
//import com.codeclan.betterbooks.repositories.BookshelfRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//class BookshelfController {
//
//    @Autowired
//    BookshelfRepository bookshelfRepository;
//
//    @GetMapping(value = "/bookshelves")
//    public ResponseEntity<List<Bookshelf>> getAllBookshelves() {
//        return new ResponseEntity<>(bookshelfRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/bookshelves/{id}")
//    public ResponseEntity getSingleBookshelf(@PathVariable Long id) {
//        return new ResponseEntity(bookshelfRepository.findById(id), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/bookshelves/{id}")
//    public ResponseEntity<Optional> deleteBookshelf(@PathVariable Long id) {
//        bookshelfRepository.deleteById(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PutMapping(value = "/bookshelves/{id}")
//    public ResponseEntity<Bookshelf> updateBookshelf(
//            @RequestBody Bookshelf bookshelf,
//            @PathVariable Long id) {
//        Bookshelf updatedBookshelf = bookshelfRepository.findById(id).get();
//        updatedBookshelf.setName(bookshelf.getName());
//        updatedBookshelf.setBookEntries(bookshelf.getBookEntries());
//        updatedBookshelf.setUser(bookshelf.getUser());
//
//        bookshelfRepository.save(updatedBookshelf);
//
//        return new ResponseEntity<>(updatedBookshelf, HttpStatus.OK);
//    }
//}