package org.andrew.models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Book must have title")
    @Size(min = 1, max = 150, message = "Title must have 1-150 symbols")
    private String title;

    @NotEmpty(message = "Book must have author")
    @Size(min = 1, max = 150, message = "Author must have 1-150 symbols")
    private String author;

    @Min(value = 1000, message = "Incorrect year, must be later than 1000")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
