package ru.roman;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Война и мир",1886,new Author("Лев","Толстой"));
        System.out.println("book.nameBook = " + book.getNameBook());
        book.setYearBook(1887);
        System.out.println("book.getYearBook() = " + book.getYearBook());
        String author=book.getAuthor().getNameAuthor()+' '+book.getAuthor().getFullNameAuthor();
        System.out.println("author = " + author);

        Book book1 = new Book("Преступление и наказание", 1990,new Author("Федор","Достоевский"));
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        System.out.println("book1.getYearBook() = " + book1.getYearBook());
        String author1=book1.getAuthor().getNameAuthor()+' '+book1.getAuthor().getFullNameAuthor();
        System.out.println("author = " + author1);

    }
}
