package com.hillel;

import java.util.Scanner;

public class MethodsForCalculator {
    public static int getInt() {
        System.out.print("Enter integer value: ");
        Scanner NewScanner = new Scanner(System.in);
        int TemporaryValue = NewScanner.nextInt();
        System.out.println("User input: " + TemporaryValue);
        return TemporaryValue;
    }

    public static char getOperation() {
        Scanner NewScanner = new Scanner(System.in);
        System.out.println("Enter one of available math operations: '+' '-' '*' '/' ");
        char TemporaryChar = NewScanner.next().charAt(0);
        System.out.println("Selected operation is: '" + TemporaryChar + "'");
        return TemporaryChar;
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                System.out.print("Total after summation: ");
                return num1 + num2;
            case '-':
                System.out.print("Total after substraction: ");
                return num1 - num2;
            case '*':
                System.out.print("Total after multiplication: ");
                return num1 * num2;
            case '/':
                System.out.print("Total after division: ");
                return num1 / num2;
            default:
                System.out.println("It's not a math operation available for user!");
                return 0;
        }
    }
}
