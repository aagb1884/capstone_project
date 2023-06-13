package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.models.Status;
import com.codeclan.betterbooks.models.people.Author;
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
    @GetMapping(value = "/bookentries/users")
    public ResponseEntity<List<BookEntry>> findBookEntryByUserId(
            @RequestParam(name="id") Long id){
        return new ResponseEntity<>(bookEntryRepository.findByUserId(id), HttpStatus.OK);
    }

    @GetMapping(value = "/bookentries/users/{id}/wanttoread")
    public ResponseEntity<List<BookEntry>> findBookEntryByUserIdAndWantToRead(
            @PathVariable Long id){
        return new ResponseEntity<>(bookEntryRepository.findByUserIdAndStatus(id, Status.WANTTOREAD), HttpStatus.OK);
    } @GetMapping(value = "/bookentries/users/{id}/currentlyreading")
    public ResponseEntity<List<BookEntry>> findBookEntryByUserIdAndCurrentlyRead(
            @PathVariable Long id){
        return new ResponseEntity<>(bookEntryRepository.findByUserIdAndStatus(id, Status.CURRENTLYREADING), HttpStatus.OK);
    } @GetMapping(value = "/bookentries/users/{id}/haveread")
    public ResponseEntity<List<BookEntry>> findBookEntryByUserIdAndHaveRead(
            @PathVariable Long id){
        return new ResponseEntity<>(bookEntryRepository.findByUserIdAndStatus(id, Status.HAVEREAD), HttpStatus.OK);
    }

    @GetMapping(value = "/bookentries/books")
    public ResponseEntity<List<BookEntry>> findBookEntryByBookId(
            @RequestParam(name="id") Long id){
        return new ResponseEntity<>(bookEntryRepository.findByBookId(id), HttpStatus.OK);
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
        updatedBookEntry.setReview(bookEntry.getReview());

        bookEntryRepository.save(updatedBookEntry);

        return new ResponseEntity<>(updatedBookEntry, HttpStatus.OK);
    }

    @PostMapping(value = "/bookentries")
    public ResponseEntity<BookEntry> createBookEntry(@RequestBody BookEntry bookEntry) {
        BookEntry newBookEntry = new BookEntry();
        newBookEntry.setBook(bookEntry.getBook());
        newBookEntry.setUser(bookEntry.getUser());
        newBookEntry.setStatus(bookEntry.getStatus());
        newBookEntry.setStartedReading(bookEntry.getStartedReading());
        newBookEntry.setFinishedReading(bookEntry.getFinishedReading());
        newBookEntry.setStarRating(bookEntry.getStarRating());
        newBookEntry.setReview(bookEntry.getReview());

        bookEntryRepository.save(newBookEntry);
        BookEntry createdBookEntry = bookEntryRepository.findById(newBookEntry.getId()).get();

        return new ResponseEntity<>(createdBookEntry, HttpStatus.CREATED);
    }
}
