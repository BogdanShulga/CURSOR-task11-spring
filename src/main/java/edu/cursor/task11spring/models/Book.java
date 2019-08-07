package edu.cursor.task11spring.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private BookGenre genre;
    private String description;
    private double rate;
    private Author author;
}
