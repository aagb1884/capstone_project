package com.codeclan.betterbooks.models.people;


import javax.persistence.*;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Person {
//    @Id
//    @GeneratedValue
//    private Long id;

    private String firstname;
    private String lastname;
    private String imgUrl;
    private String bio;

    public Person(String firstname, String lastname, String imgUrl, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.imgUrl = imgUrl;
        this.bio = bio;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
