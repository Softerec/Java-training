package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book extends Prototype<Book>{

    private String title;
    private String author;
    private LocalDate publicationDate;

    public Book(String title, String author, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public Book clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "\n  title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate;
    }
}