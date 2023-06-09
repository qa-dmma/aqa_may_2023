package com.hillel;

import java.util.Random;

public class TwoArrays {
    public static void main(String[] args) {
        int ArrayLenght = 5;
        int RandomValue = ArrayLenght + 1;
        int ArrayOneWeight = 0;
        int ArrayTwoWeight = 0;
        int ArrayOne[] = new int[ArrayLenght];
        int ArrayTwo[] = new int[ArrayLenght];
        Random Rand = new Random();
        for (int i = 0; i != ArrayLenght; i++) {
            int IntRandom = Rand.nextInt(RandomValue);
            ArrayOne[i] = IntRandom;
            System.out.print(ArrayOne[i] + " ");
            ArrayOneWeight = ArrayOneWeight + ArrayOne[i];
        }
        float AvarageArrayOne = (float) ArrayOneWeight/ArrayLenght;
        System.out.println(" ");
        System.out.println("Среднее арифметическое первого массива: "+ArrayOneWeight+" / "+ArrayLenght+" = "
                +AvarageArrayOne);
        for (int i = 0; i != ArrayLenght; i++) {
            int IntRandom = Rand.nextInt(RandomValue);
            ArrayTwo[i] = IntRandom;
            System.out.print(ArrayTwo[i] + " ");
            ArrayTwoWeight = ArrayTwoWeight + ArrayTwo[i];
        }
        float AvarageArrayTwo = (float) ArrayTwoWeight/ArrayLenght;
        System.out.println(" ");
        System.out.println("Среднее арифметическое второго массива: "+ArrayTwoWeight+" / "+ArrayLenght+" = "
                +AvarageArrayTwo);
        if (AvarageArrayOne > AvarageArrayTwo) {
            System.out.println("Среднее арифметическое первого массива больше: "+AvarageArrayOne+" > "+AvarageArrayTwo );
        }
        else if (AvarageArrayTwo > AvarageArrayOne){
            System.out.println("Среднее арифметическое второго массива больше: "+AvarageArrayTwo+" < "+AvarageArrayOne );
        }
        else {
            System.out.println("Среднее арифметическое двух массивов равны: "+AvarageArrayOne+" = "+AvarageArrayTwo);
        }
    }
}
