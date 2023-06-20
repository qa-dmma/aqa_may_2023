package com.hillel;


public class PracticeString {
    static String inputString, lastChar, cutWord, replaceChar, inputStringUpper, inputStringLower;
    static int wordPosition;

    public static String getString() {
        GetScanner.getScanner();
        inputString = GetScanner.getScanner().nextLine();
        int lastIndex = Integer.parseInt(String.valueOf(inputString.length()));
        lastChar = String.valueOf(inputString.charAt(lastIndex - 1));
//        GetScanner.getScanner().close();
        return "";
    }

    public static String endsWith() {
        if (inputString.endsWith("!!!")) {
            System.out.println("Your string ends with '!!!'");
        } else {
            System.out.println("Your string don't ends with '!!!'");
        }
        return "";
    }

    public static String startWith() {
        if (inputString.startsWith("I like")) {
            System.out.println("Your string starts with 'I like'");
        } else {
            System.out.println("Your string don't starts with 'I like'");
        }
        return "";
    }

    public static String contains() {
        if (inputString.contains("Java")) {
            System.out.println("Your string contains 'Java'");
            wordPosition = inputString.indexOf("Java");
            System.out.println("'Java' position is : " + wordPosition);
            cutWord = inputString.substring(wordPosition, wordPosition + 4);
            System.out.println("The word '" + cutWord + "' has been cutted");
        } else {
            System.out.println("Your string don't contains 'Java'");
        }
        return "";
    }

    public static String replaceChars() {
        replaceChar = inputString.replaceAll("a", "o");
        return replaceChar;
    }

    public static String toUpper() {
        inputStringUpper = inputString.toUpperCase();
        return inputStringUpper;
    }

    public static String toLower() {
        inputStringLower = inputString.toLowerCase();
        return inputStringLower;
    }

}



