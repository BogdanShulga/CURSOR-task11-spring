package edu.cursor.task11spring.libraryHandler;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.Book;
import edu.cursor.task11spring.library.BookGenre;
import edu.cursor.task11spring.library.TwoBooks;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
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
        if (authorBooksMap.containsKey(author) && authorBooksMap.get(author).contains(book) && authorBooksMap.get(author).size() == 1) {
            authorBooksMap.remove(author);
            answer = "The book and author are removed!";
        } else if (authorBooksMap.containsKey(author) && authorBooksMap.get(author).contains(book) && authorBooksMap.get(author).size() > 1) {
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
    public String updateBook(TwoBooks twoBooks) {
        Book oldBook = twoBooks.getOldBook();
        Book newBook = twoBooks.getNewBook();

        Author oldAuthor = oldBook.getAuthor();
        Author newAuthor = newBook.getAuthor();
        String answer;
        if (authorBooksMap.containsKey(oldAuthor) && authorBooksMap.get(oldAuthor).contains(oldBook) && authorBooksMap.get(oldAuthor).size() == 1) {
            authorBooksMap.remove(oldAuthor);
            addBook(newBook);
            answer = "The old book is replaced by new one!";
        } else if (authorBooksMap.containsKey(oldAuthor) && authorBooksMap.get(oldAuthor).contains(oldBook) && authorBooksMap.get(oldAuthor).size() > 1 && oldAuthor.equals(newAuthor)) {
            authorBooksMap.get(newAuthor).remove(oldBook);
            addBook(newBook);
            answer = "The old book is replaced by new one!";
        } else {
            addBook(newBook);
            answer = "The old book is absent, new book added!";
        }
        return answer;
    }
}
