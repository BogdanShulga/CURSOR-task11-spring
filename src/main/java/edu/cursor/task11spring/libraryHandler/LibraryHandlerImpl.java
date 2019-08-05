package edu.cursor.task11spring.libraryHandler;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.Book;
import edu.cursor.task11spring.library.BookGenre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class LibraryHandlerImpl implements LibraryHandler {

    Map<Author, List<Book>> authorBooksMap;

    @Override
    public String addBook(Book book) {
        Author author = book.getAuthor();
        String answer;
        if (authorBooksMap.containsKey(author) && authorBooksMap.get(author).contains(book)) {
            answer = "This book is already present in the library!";
        } else if (authorBooksMap.containsKey(author) && !authorBooksMap.get(author).contains(book)) {
            authorBooksMap.get(author).add(book);
            answer = "The book is added!";
        } else {
            List<Book> books = new ArrayList<>();
            books.add(book);
            authorBooksMap.put(author, books);
            answer = "The book is added!";
        }
        return answer;
    }

    @Override
    public String deleteBook(Book book) {
        Author author = book.getAuthor();
        String answer;
        if (authorBooksMap.containsKey(author) && authorBooksMap.get(author).contains(book)) {
            authorBooksMap.get(author).remove(book);
            answer = "The book is removed!";
        } else {
            answer = "This book is not present in the library!";
        }
        return answer;
    }

    @Override
    public Map<Author, List<Book>> getSortedByAuthor() {
        return authorBooksMap;
    }

    @Override
    public Map<BookGenre, List<Book>> getSortedByGenre() {
        return authorBooksMap.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    @Override
    public boolean updateBook(Book oldBook, Book newBook) {
        Author oldAuthor = oldBook.getAuthor();
        Author newAuthor = newBook.getAuthor();
        if (authorBooksMap.containsKey(oldAuthor) && authorBooksMap.get(oldAuthor).contains(oldBook) && authorBooksMap.get(oldAuthor).size() == 1) {
            authorBooksMap.remove(oldAuthor);
            addBook(newBook);
        } else if (authorBooksMap.containsKey(oldAuthor) && authorBooksMap.get(oldAuthor).contains(oldBook) && authorBooksMap.get(oldAuthor).size() > 1 && oldAuthor.equals(newAuthor)) {
            authorBooksMap.get(newAuthor).remove(oldBook);
            addBook(newBook);
        } else {
            addBook(newBook);
        }
        return true;
    }
}
