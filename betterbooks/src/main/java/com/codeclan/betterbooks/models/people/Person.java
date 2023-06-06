//package com.codeclan.betterbooks.models.people;
//
//
//import com.sun.istack.NotNull;
//
//import javax.persistence.*;
//
//
//
//@Entity
//public abstract class Person {
//    @Id
//    private Long id;
//    @Column
//    private String firstname;
//    @Column
//    private String lastname;
//    @Column
//    private String imgUrl;
//    @Column
//    private String bio;
//
//    public Person(String firstname, String lastname, String imgUrl, String bio) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.imgUrl = imgUrl;
//        this.bio = bio;
//    }
//
//    public Person() {
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getImgUrl() {
//        return imgUrl;
//    }
//
//    public void setImgUrl(String imgUrl) {
//        this.imgUrl = imgUrl;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//}
