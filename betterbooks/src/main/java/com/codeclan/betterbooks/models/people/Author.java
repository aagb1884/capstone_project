package com.codeclan.betterbooks.models.people;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author extends Creator{

    public Author(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }
}
