package com.hillel;

public class StudentsList {
    static String studentName, subject, fullString;

    static int score;


    public static String inputValues() {
        System.out.println("Введите фамилию студента: ");
        GetScanner.getScanner();
        studentName = GetScanner.getScanner().nextLine();
        System.out.println("Введите оценку студента: ");
        GetScanner.getScanner();
        score = GetScanner.getScanner().nextInt();
        System.out.println("Введите предмет: ");
        GetScanner.getScanner();
        subject = GetScanner.getScanner().nextLine();
//        GetScanner.getScanner().close();
        return "";
    }

    public static String concatString() {
        fullString = String.format("Студент " + "%-14s получил " + "%-2s по " + "%-9s",
                studentName, score, subject);
        return fullString;
    }

}
