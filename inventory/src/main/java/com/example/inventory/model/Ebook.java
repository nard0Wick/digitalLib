package com.example.inventory.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ebooks")
public class Ebook {
    @Id
    private String id;
    private String title;
    private String ISBN;
    private Date pubDate;
    private int licenseCount;
    private List<Category> categories;
    private List<String> authorsIds;
}

enum Category{
    ROMANCE, MYSTERY, THRILLER, FANTASY, SCIENCE_FICTION, YOUNG_ADULT
}
