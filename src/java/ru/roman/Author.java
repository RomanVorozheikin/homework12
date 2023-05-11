package ru.roman;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (!Objects.equals(nameAuthor, author.nameAuthor)) return false;
        return Objects.equals(fullNameAuthor, author.fullNameAuthor);
    }

    @Override
    public int hashCode() {
        int result = nameAuthor != null ? nameAuthor.hashCode() : 0;
        result = 31 * result + (fullNameAuthor != null ? fullNameAuthor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.nameAuthor+' '+this.fullNameAuthor;
    }
}
