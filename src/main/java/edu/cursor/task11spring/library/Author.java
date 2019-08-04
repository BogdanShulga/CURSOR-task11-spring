package edu.cursor.task11spring.library;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author {
    private int id;
    private String fName;
    private String lName;
}
