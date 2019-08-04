package edu.cursor.task11spring.libraryHandler;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.Book;
import edu.cursor.task11spring.library.BookGenre;
import edu.cursor.task11spring.libraryHandler.LibraryHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class LibraryHandlerImpl implements LibraryHandler {

    List<Book> books;

    @Override
    public void addAuthorBook() {

    }

    @Override
    public void deleteAuthorBook() {

    }

    @Override
    public void addBookToAuthor() {

    }

    @Override
    public Map<Author, List<Book>> getSortedByAuthor() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

    @Override
    public Map<BookGenre, List<Book>> getSortedByGenre() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    @Override
    public void refactorAuthorBook() {

    }
}
