package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.repositories.BookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class BookEntryController {

    @Autowired
    BookEntryRepository bookEntryRepository;

    @GetMapping(value = "/bookentries")
    public ResponseEntity<List<BookEntry>> getAllBookEntries(){
        return new ResponseEntity<>(bookEntryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookentries/{id}")
    public ResponseEntity getSingleBookEntry(@PathVariable Long id) {
        return new ResponseEntity(bookEntryRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/bookentries/{id}")
    public ResponseEntity<Optional> deleteBookEntry(@PathVariable Long id){
        bookEntryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/bookentries/{id}")
    public ResponseEntity<BookEntry> updateBookEntry(
            @RequestBody BookEntry bookEntry,
            @PathVariable Long id){
        BookEntry updatedBookEntry = bookEntryRepository.findById(id).get();
        updatedBookEntry.setBook(bookEntry.getBook());
        updatedBookEntry.setUser(bookEntry.getUser());
        updatedBookEntry.setStatus(bookEntry.getStatus());
        updatedBookEntry.setStartedReading(bookEntry.getStartedReading());
        updatedBookEntry.setFinishedReading(bookEntry.getFinishedReading());
        updatedBookEntry.setStarRating(bookEntry.getStarRating());

        bookEntryRepository.save(updatedBookEntry);

        return new ResponseEntity<>(updatedBookEntry, HttpStatus.OK);
    }
}
