package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Library library = new Library("National Library");
        Book book1 = new Book("Roczniki", "Jan Długosz", LocalDate.of(1370,01,01));
        Book book2 = new Book("Statuty Kazimierza Wielkiego", "?", LocalDate.of(1340,01,01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Shallow National Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deeoCopyLibrary = null;
        try {
            deeoCopyLibrary = library.deepCopy();
            deeoCopyLibrary.setName("Deep National Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deeoCopyLibrary.getBooks().add(new Book("Thorgal","Rosiński i Van Hamme", LocalDate.of(1980,01,01)));

        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deeoCopyLibrary);

        assertEquals( 2, library.getBooks().size());
        assertEquals( 2, shallowCopyLibrary.getBooks().size());
        assertEquals(library.getBooks(), shallowCopyLibrary.getBooks());
        assertEquals( 3, deeoCopyLibrary.getBooks().size());
    }
}
