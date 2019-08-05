package edu.cursor.task11spring.libraryHandler;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.Book;
import edu.cursor.task11spring.library.BookGenre;
import edu.cursor.task11spring.library.TwoBooks;

import java.util.List;
import java.util.Map;

public interface LibraryHandler {
    String addBook(Book book);

    String deleteBook(Book book);

    Map<Author, List<Book>> getSortedByAuthor();

    Map<BookGenre, List<Book>> getSortedByGenre();

    String updateBook(TwoBooks twoBooks);
}
