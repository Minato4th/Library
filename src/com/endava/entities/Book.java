package com.endava.entities;

import java.util.HashMap;
import java.util.Map;

//Main class for all information about book
public class Book {
    int ID;
    Title title;
    Author author;
    ISBN isbn;
    Language language;
    Publisher publisher;
    Year year;

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", title=" + title +
                ", author=" + author +
                ", isbn=" + isbn +
                ", language=" + language +
                ", publisher=" + publisher +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getID() != book.getID()) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if (getIsbn() != null ? !getIsbn().equals(book.getIsbn()) : book.getIsbn() != null) return false;
        if (getLanguage() != null ? !getLanguage().equals(book.getLanguage()) : book.getLanguage() != null)
            return false;
        if (getPublisher() != null ? !getPublisher().equals(book.getPublisher()) : book.getPublisher() != null)
            return false;
        return getYear() != null ? getYear().equals(book.getYear()) : book.getYear() == null;

    }

    @Override
    public int hashCode() {
        int result = getID();
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getIsbn() != null ? getIsbn().hashCode() : 0);
        result = 31 * result + (getLanguage() != null ? getLanguage().hashCode() : 0);
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        return result;
    }

    public Book(int ID, Title title, Author author, ISBN isbn, Language language, Publisher publisher, Year year) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.language = language;
        this.publisher = publisher;
        this.year = year;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public void setIsbn(ISBN isbn) {
        this.isbn = isbn;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
