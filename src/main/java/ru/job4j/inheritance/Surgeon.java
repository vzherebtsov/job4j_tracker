package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String scalpelType;

    public Surgeon(String name, String surname, String education, int birthday, String docSpec, String scalpelType) {
        super(name, surname, education, birthday, docSpec);
        this.scalpelType = scalpelType;
    }

    public boolean operation() {
        return true;
    }
}