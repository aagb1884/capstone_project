package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.people.Author;
import com.codeclan.betterbooks.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping(value = "/authors")
    public ResponseEntity<List<Author>> getAllAuthors(){
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/authors/{id}")
    public ResponseEntity getSingleAuthor(@PathVariable Long id) {
        return new ResponseEntity(authorRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/authors/{id}")
    public ResponseEntity<Optional> deleteAuthor(@PathVariable Long id){
        authorRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping(value = "/authors/{id}")
    public ResponseEntity<Author> updateAuthor(
            @RequestBody Author author,
            @PathVariable Long id){
        Author updatedAuthor = authorRepository.findById(id).get();
        updatedAuthor.setFirstname(author.getFirstname());
        updatedAuthor.setLastname(author.getLastname());
        updatedAuthor.setBio(author.getBio());
        updatedAuthor.setBooks(author.getBooks());
        updatedAuthor.setImgUrl(author.getImgUrl());

        authorRepository.save(updatedAuthor);

        return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
    }
}
