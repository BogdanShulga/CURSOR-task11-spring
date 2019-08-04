package edu.cursor.task11spring.controller;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.BookGenre;
import edu.cursor.task11spring.libraryHandler.LibraryHandlerImpl;
import edu.cursor.task11spring.library.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/edu/cursor")
@AllArgsConstructor
public class LibraryController {

    LibraryHandlerImpl libraryHandler;

    @RequestMapping(value = "/getSortedByAuthor", method = RequestMethod.GET)
    public Map<Author, List<Book>> getSortedByAuthor(){
        return libraryHandler.getSortedByAuthor();
    }

    @RequestMapping(value = "/getSortedByGenre", method = RequestMethod.GET)
    public Map<BookGenre, List<Book>> getSortedByGenre(){
        return libraryHandler.getSortedByGenre();
    }
}
