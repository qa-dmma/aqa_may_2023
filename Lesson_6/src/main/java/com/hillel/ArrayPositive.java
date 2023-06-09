package com.hillel;

public class ArrayPositive {
    public static void main(String[] args) {
        int Array[] = new int[10];
        int j = 2;
        for(int i=0; i!=Array.length;i++, j+=2) {
            Array[i] = j;
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");
        for (int k : Array){
            System.out.println(k);
        }
        }
    }

