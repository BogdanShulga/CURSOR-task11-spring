package edu.cursor.task11spring.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class LibraryCollection {
    @Bean
    public Map<Author, List<Book>> initiateAuthorBooksMap() {
        Map<Author, List<Book>> authorBooksMap = new HashMap<>();

        Author author1 = new Author(1, "Nidhi", "Agrawal");
        List<Book> books1 = new ArrayList<>();
        String d1 = "Aakriti is in love with Neeraj.Neeraj is also mad for Aakriti.but she found out him not to be a good boy.";
        books1.add(new Book(1, "A cute love story", BookGenre.ROMANCE, d1, 156, null));
        authorBooksMap.put(author1, books1);


        Author author2 = new Author(2, "Rachel", "G");
        List<Book> books2 = new ArrayList<>();
        String d2 = "A girl who hits the clubs every other day and sleeps with 1 diffrent guy every other day until she finds the perfect guy.";
        books2.add(new Book(2, "Ultimate Pleasure", BookGenre.EROTIC, d2, 203, null));
        authorBooksMap.put(author2, books2);

        Author author3 = new Author(3, "Niranjan", "Jha");
        List<Book> books3 = new ArrayList<>();
        String d3 = "Learn English Speaking and Grammar through Hindi language.";
        books3.add(new Book(3, "English Speaking and Grammar through Hindi", BookGenre.EDUCATION, d3, 100, null));
        String d4 = "It is a great achievement for any man to perform extraordinary acts, but it is...";
        books3.add(new Book(4, "Be Millionaire Like Me", BookGenre.EDUCATION, d4, 400, null));
        authorBooksMap.put(author3, books3);

        Author author5 = new Author(5, "Melissa", "Nichols");
        List<Book> books5 = new ArrayList<>();
        String d5 = "Can one woman find love in a world of rejection, war and hate?";
        books5.add(new Book(5, "Dragon Girl", BookGenre.FANTASY, d5, 324, null));
        authorBooksMap.put(author5, books5);

        Author author6 = new Author(6, "Marie", "Kelly");
        List<Book> books6 = new ArrayList<>();
        String d6 = "To stop his brother from an unsuitable marriage, Nikias Dranias holds the woman he believes...";
        books6.add(new Book(6, "Kidnapped the Wrong Sister", BookGenre.DRAMA, d6, 4563, null));
        authorBooksMap.put(author6, books6);

        Author author7 = new Author(7, "Jess", "Wygle");
        List<Book> books7 = new ArrayList<>();
        String d7 = "Secrets are a dangerous thing, especially when an entire relationship is based off one, big, destructive secret.";
        books7.add(new Book(7, "Hush", BookGenre.THRILLER, d7, 45452, null));
        authorBooksMap.put(author7, books7);

        authorBooksMap.forEach((author, books) -> {
            books.forEach(book -> book.setAuthor(author));
        });

        return authorBooksMap;
    }
}
