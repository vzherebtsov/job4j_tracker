package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vsevolod Zherebtsov");
        student.setGroup("ГЭ - 1 - 07");
        student.setDate("01.09.2007");
        System.out.println(student.getName() + " - Группа: " + student.getGroup() + ". Дата поступления: " + student.getDate());
    }
}
