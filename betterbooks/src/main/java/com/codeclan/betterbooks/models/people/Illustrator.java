package com.codeclan.betterbooks.models.people;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "illustrators")
public class Illustrator extends Creator{

    public Illustrator(String firstname, String lastname, String imgUrl, String bio) {
        super(firstname, lastname, imgUrl, bio);
    }
}
