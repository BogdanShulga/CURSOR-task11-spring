package edu.cursor.task11spring.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TwoBooks {
    private Book oldBook;
    private Book newBook;
}
