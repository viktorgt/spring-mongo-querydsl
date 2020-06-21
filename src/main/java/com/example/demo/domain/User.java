package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    public User(final String name) {
        this.name = name;
    }

    @Id
    private final String name;

    public String getName() {
        return name;
    }
}
