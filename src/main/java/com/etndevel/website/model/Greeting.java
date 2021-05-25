package com.etndevel.website.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public Greeting() {
    }
    
    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }
}
