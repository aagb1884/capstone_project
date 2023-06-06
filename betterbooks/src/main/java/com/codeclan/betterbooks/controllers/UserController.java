package com.codeclan.betterbooks.controllers;

import com.codeclan.betterbooks.models.Book;
import com.codeclan.betterbooks.models.people.User;
import com.codeclan.betterbooks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUserrs(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getSingleUser(@PathVariable Long id) {
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<Optional> deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> updateUser(
            @RequestBody User user,
            @PathVariable Long id){
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setLastname(user.getLastname());
        updatedUser.setImgUrl(user.getImgUrl());
        updatedUser.setBio(user.getBio());

        userRepository.save(updatedUser);

        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
