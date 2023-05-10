package ru.roman;

public class Book {
    private String nameBook;
    private int yearBook;
    private Author author;
    public Book(String nameBook, int yearBook,Author author) {
        this.nameBook=nameBook;
        this.yearBook=yearBook;
        this.author=author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook=yearBook;
    }
}

