package ru.roman;

public class Author {
    private String nameAuthor;
    private String fullNameAuthor;

    public Author(String nameAuthor, String fullNameAuthor) {
        this.nameAuthor=nameAuthor;
        this.fullNameAuthor=fullNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getFullNameAuthor() {
        return this.fullNameAuthor;
    }
}
