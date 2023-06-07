package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.BookEntry;
import com.codeclan.betterbooks.models.people.Illustrator;
import com.codeclan.betterbooks.repositories.IllustratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    class IllustratorController {

        @Autowired
        IllustratorRepository illustratorRepository;

        @GetMapping(value = "/illustrators")
        public ResponseEntity<List<Illustrator>> getAllIllustrators(){
            return new ResponseEntity<>(illustratorRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping(value = "/illustrators/{id}")
        public ResponseEntity getSingleIllustrator(@PathVariable Long id) {
            return new ResponseEntity(illustratorRepository.findById(id), HttpStatus.OK);
        }

        @DeleteMapping(value = "/illustrators/{id}")
        public ResponseEntity<Optional> deleteIllustrator(@PathVariable Long id){
            illustratorRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        @PutMapping(value = "/illustrators/{id}")
        public ResponseEntity<Illustrator> updateIllustrator(
                @RequestBody Illustrator illustrator,
                @PathVariable Long id){
            Illustrator updatedIllustrator = illustratorRepository.findById(id).get();
            updatedIllustrator.setFirstname(illustrator.getFirstname());
            updatedIllustrator.setLastname(illustrator.getLastname());
            updatedIllustrator.setBio(illustrator.getBio());
            updatedIllustrator.setBooks(illustrator.getBooks());
            updatedIllustrator.setImgUrl(illustrator.getImgUrl());

            illustratorRepository.save(updatedIllustrator);

            return new ResponseEntity<>(updatedIllustrator, HttpStatus.OK);
        }


        @PostMapping(value = "/illustrators")
        public ResponseEntity<Illustrator> createIllustrator(@RequestBody Illustrator illustrator) {
            Illustrator newIllustrator = new Illustrator();
            newIllustrator.setFirstname(illustrator.getFirstname());
            newIllustrator.setLastname(illustrator.getLastname());
            newIllustrator.setBio(illustrator.getBio());
            newIllustrator.setBooks(illustrator.getBooks());
            newIllustrator.setImgUrl(illustrator.getImgUrl());

            illustratorRepository.save(newIllustrator);

            return new ResponseEntity<>(newIllustrator, HttpStatus.CREATED);
        }
}
