package edu.cursor.task11spring.library;

import edu.cursor.task11spring.library.BookGenre;

import edu.cursor.task11spring.library.Author;
import edu.cursor.task11spring.library.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LibraryCollection {
    @Bean
    public List<Book> initiateBooks() {

        List<Book> books = new ArrayList<>();

        String d1 = "Aakriti is in love with Neeraj.Neeraj is also mad for Aakriti.but she found out him not to be a good boy.";
        Author author1 = new Author(1, "Nidhi", "Agrawal");
        books.add(new Book(1, "A cute love story", BookGenre.ROMANCE, d1, 156, author1));

        String d2 = "A girl who hits the clubs every other day and sleeps with 1 diffrent guy every other day until she finds the perfect guy.";
        Author author2 = new Author(2, "Rachel", "G");
        books.add(new Book(2, "Ultimate Pleasure", BookGenre.EROTIC, d2, 203, author2));

        String d3 = "Learn English Speaking and Grammar through Hindi language.";
        Author author3 = new Author(3, "Niranjan", "Jha");
        books.add(new Book(3, "English Speaking and Grammar through Hindi", BookGenre.EDUCATION, d3, 100, author3));

        String d4 = "It is a great achievement for any man to perform extraordinary acts, but it is...";
        books.add(new Book(4, "Be Millionaire Like Me", BookGenre.EDUCATION, d4, 400, author3));

        String d5 = "Can one woman find love in a world of rejection, war and hate?";
        Author author5 = new Author(5, "Melissa", "Nichols");
        books.add(new Book(5, "Dragon Girl", BookGenre.FANTASY, d5, 324, author5));

        String d6 = "To stop his brother from an unsuitable marriage, Nikias Dranias holds the woman he believes...";
        Author author6 = new Author(6, "Marie", "Kelly");
        books.add(new Book(6, "Kidnapped the Wrong Sister", BookGenre.DRAMA, d6, 4563, author6));

        String d7 = "Secrets are a dangerous thing, especially when an entire relationship is based off one, big, destructive secret.";
        Author author7 = new Author(7, "Jess", "Wygle");
        books.add(new Book(7, "Hush", BookGenre.THRILLER, d7, 45452, author7));

        return books;
    }
}
