package com.hillel;

import java.util.Arrays;

public class ArrayNegative {
    public static void main(String[] args) {
        int SizeArr = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) SizeArr++;
        }
        int Array[] = new int[SizeArr];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Array[b] = i;
                System.out.print(Array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i= Array.length-1;i>=0;i--){
            System.out.print(Array[i] + " ");
        }

    }
}