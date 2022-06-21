package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private String author;
    private String title;
    private String publishYear;

    public Book(String author, String title, String publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishYear() {
        return publishYear;
    }
}
