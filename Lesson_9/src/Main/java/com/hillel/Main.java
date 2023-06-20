package com.hillel;


public class Main {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        PracticeString.getString();
        System.out.println("Last Char: " + PracticeString.lastChar);
        System.out.print(PracticeString.endsWith());
        System.out.print(PracticeString.startWith());
        System.out.print(PracticeString.contains());
        System.out.println("Inputed string after replacement : " + PracticeString.replaceChars());
        System.out.println("Inputed string to upper case : " + PracticeString.toUpper());
        System.out.println("Inputed string to lower case : " + PracticeString.toLower());
        System.out.println("__________________");
        StudentsList.inputValues();
        System.out.println(StudentsList.concatString());


    }
}