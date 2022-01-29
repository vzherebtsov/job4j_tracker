package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int electricalSafetyGroup;

    public Engineer(String name, String surname, String education, int birthday, int electricalSafetyGroup) {
        super(name, surname, education, birthday);
        this.electricalSafetyGroup = electricalSafetyGroup;
    }

    public boolean draw() {
        return false;
    }
}