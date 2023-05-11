package ru.roman;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Война и мир",1886,new Author("Лев","Толстой"));
        book.setYearBook(1887);
        System.out.println(book);

        Book book1=new Book("Война и мир",1887,new Author("Лев","Толстой"));

        Book book2 = new Book("Преступление и наказание", 1990,new Author("Федор","Достоевский"));
        System.out.println(book1);
        System.out.println(book.equals(book1));

    }
}
