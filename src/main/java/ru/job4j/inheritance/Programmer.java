package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String progLang;

    public Programmer(String name, String surname, String education, int birthday, int electricalSafetyGroup, String progLang) {
        super(name, surname, education, birthday, electricalSafetyGroup);
        this.progLang = progLang;
    }

    public boolean coding() {
        return true;
    }
}