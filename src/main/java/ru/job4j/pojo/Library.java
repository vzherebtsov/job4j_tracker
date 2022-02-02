package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 464);
        Book book1 = new Book("Master and Margaret", 500);
        Book book2 = new Book("History of Russia", 1500);
        Book book3 = new Book("Java. The Complete Reference", 1488);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPage());
        }
        System.out.println("Replace first book to fourth book");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPage());
        }
        System.out.println("Show only \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getNumberOfPage());
            }
        }
    }
}