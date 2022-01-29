package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String docSpec;

    public Doctor(String name, String surname, String education, int birthday, String docSpec) {
        super(name, surname, education, birthday);
        this.docSpec = docSpec;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}