package ru.roman;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Война и мир",1886);
        System.out.println("book.nameBook = " + book.getNameBook());
        book.setYearBook(1887);
        System.out.println("book.getYearBook() = " + book.getYearBook());

        Book book1 = new Book("Преступление и наказание", 1990);
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        System.out.println("book1.getYearBook() = " + book1.getYearBook());

        Author author=new Author("Лев","Толстой");
        System.out.println("author.getNameAuthor() = " + author.getNameAuthor());
        System.out.println("bookAuthor.fullNameAuthor = " + author.getFullNameAuthor());

        Author author1 = new Author("Федор", "Достоевский");
        System.out.println("author1.nameAuthor = " + author1.getNameAuthor());
        System.out.println("author1.fullNameAuthor = " + author1.getFullNameAuthor());
    }
}
