package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport report1 = new JSONReport();
        String text1 = report1.generate("report's name", "report's body");
        System.out.println(text1);
    }
}