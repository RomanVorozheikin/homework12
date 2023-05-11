package ru.roman;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearBook != book.yearBook) return false;
        if (!Objects.equals(nameBook, book.nameBook)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = nameBook != null ? nameBook.hashCode() : 0;
        result = 31 * result + yearBook;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Название: "+this.nameBook+", Год публикации: "+this.yearBook+", Автор: "+this.author;
    }
}

