//package com.codeclan.betterbooks.controllers;
//
//import com.codeclan.betterbooks.models.Status;
//import com.codeclan.betterbooks.repositories.StatusRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//class StatusController {
//
//    @Autowired
//    StatusRepository statusRepository;
//
//    @GetMapping(value = "/status")
//    public ResponseEntity<List<Status>> getAllStatuses(){
//        return new ResponseEntity<>(statusRepository.findAll(), HttpStatus.OK);
//    }
// }
