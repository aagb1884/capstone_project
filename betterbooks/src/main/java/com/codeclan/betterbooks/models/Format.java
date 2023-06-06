package com.codeclan.betterbooks.models;

public enum Format {

    PAPERBACK("Paperback"),
    BOARDBOOKFORMAT("Board Book"),
    HARDBACK("Hardback");

    private final String value;

    Format(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
}
