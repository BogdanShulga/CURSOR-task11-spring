package edu.cursor.task11spring.service;

import edu.cursor.task11spring.models.Author;
import edu.cursor.task11spring.models.Book;
import edu.cursor.task11spring.models.BookGenre;
import edu.cursor.task11spring.models.TwoBooks;

import java.util.List;
import java.util.Map;

public interface LibraryHandler {
    String addBook(Book book);
    String deleteBook(Book book);
    Map<Author, List<Book>> getSortedByAuthor();
    Map<BookGenre, List<Book>> getSortedByGenre();
    String updateBook(TwoBooks twoBooks);
}
