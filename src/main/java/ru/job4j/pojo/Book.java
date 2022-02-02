package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberOfPage;

    public Book(String name, int count) {
        this.name = name;
        this.numberOfPage = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}