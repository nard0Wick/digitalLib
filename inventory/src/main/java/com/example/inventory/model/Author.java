package com.example.inventory.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "authors")
public class Author {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String biography;
    private String nationality;
    private Date birthDate;
    private Date deathDate;
    private List<String> ebooksIds;

    public String fullName(){
        return lastName + " " + name;
    }
}
