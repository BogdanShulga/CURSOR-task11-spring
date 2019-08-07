package edu.cursor.task11spring.controller;

import edu.cursor.task11spring.models.Author;
import edu.cursor.task11spring.models.BookGenre;
import edu.cursor.task11spring.models.Book;
import edu.cursor.task11spring.models.TwoBooks;
import edu.cursor.task11spring.service.LibraryHandlerImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/edu/cursor")
@AllArgsConstructor
public class LibraryController {

    private LibraryHandlerImpl libraryHandler;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        return libraryHandler.addBook(book);
    }

    @PostMapping("/deleteBook")
    public String deleteBook(@RequestBody Book book) {
        return libraryHandler.deleteBook(book);
    }

    @GetMapping("/getSortedByAuthor")
    public Map<Author, List<Book>> getSortedByAuthor() {
        return libraryHandler.getSortedByAuthor();
    }

    @GetMapping("/getSortedByGenre")
    public Map<BookGenre, List<Book>> getSortedByGenre() {
        return libraryHandler.getSortedByGenre();
    }

    @PostMapping("/updateBook")
    public String updateBook(@RequestBody TwoBooks twoBooks) {
        return libraryHandler.updateBook(twoBooks);
    }
}
