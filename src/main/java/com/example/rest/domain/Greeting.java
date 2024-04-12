package com.example.rest.domain;

public class Greeting {
    private String message;

    public Greeting() {
        // Default constructor
    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}