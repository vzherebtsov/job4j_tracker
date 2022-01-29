package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean protectiveSuit;

    public Builder(String name, String surname, String education, int birthday, int electricalSafetyGroup, boolean protectiveSuit) {
        super(name, surname, education, birthday, electricalSafetyGroup);
        this.protectiveSuit = protectiveSuit;
    }

    public boolean jackhammer() {
        return true;
    }
}