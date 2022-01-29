package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean drillingMachine;

    public Dentist(String name, String surname, String education, int birthday, String docSpec, boolean drillingMachine) {
        super(name, surname, education, birthday, docSpec);
        this.drillingMachine = drillingMachine;
    }

    public boolean removeTooth() {
        return true;
    }
}