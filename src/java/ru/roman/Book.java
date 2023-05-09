package ru.roman;

public class Book {
    private String nameBook;
    private int yearBook;
    public Book(String nameBook, int yearBook) {
        this.nameBook=nameBook;
        this.yearBook=yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook=yearBook;
    }
}

