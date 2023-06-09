package com.hillel;


public class Calculator {
    public static void main(String[] args) {
        int FirstValue = MethodsForCalculator.getInt();
        int SecondValue = MethodsForCalculator.getInt();
        char Operation = MethodsForCalculator.getOperation();
        int TotalValue = MethodsForCalculator.calc(FirstValue, SecondValue, Operation);
        System.out.print("'" + TotalValue + "'");
    }
}
