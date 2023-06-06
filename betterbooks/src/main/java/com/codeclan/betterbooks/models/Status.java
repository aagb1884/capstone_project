package com.codeclan.betterbooks.models;

public enum Status {

    WANTTOREAD("Want to Read"),
    HAVEREAD("Have Read"),
    CURRENTLYREADING("Currently Reading");

    private final String value;

    Status(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
