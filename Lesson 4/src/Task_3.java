import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter value more than/equal 10 or less/equal 99: ");
        int Value_A = Scanner_Input.nextInt();
        if (Value_A >= 10 && Value_A <= 19) {
            int Second_char = Value_A - 10;
            int First_char = Value_A - 10 - (Second_char - 1);
            System.out.println("Range 10 - 19");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 20 && Value_A <= 29){
            int Second_char = Value_A - 20;
            int First_char = Value_A - 20 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +1;
            }
            System.out.println("Range 20 - 29");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 30 && Value_A <= 39) {
            int Second_char = Value_A - 30;
            int First_char = Value_A - 30 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +2;
            }
            System.out.println("Range 30 - 39");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 40 && Value_A <= 49) {
            int Second_char = Value_A - 40;
            int First_char = Value_A - 40 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +3;
            }
            System.out.println("Range 40 - 49");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 50 && Value_A <= 59) {
            int Second_char = Value_A - 50;
            int First_char = Value_A - 50 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +4;
            }
            System.out.println("Range 50 - 59");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 60 && Value_A <= 69) {
            int Second_char = Value_A - 60;
            int First_char = Value_A - 60 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +5;
            }
            System.out.println("Range 60 - 69");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 70 && Value_A <= 79) {
            int Second_char = Value_A - 70;
            int First_char = Value_A - 70 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +6;
            }
            System.out.println("Range 70 - 79");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 80 && Value_A <= 89) {
            int Second_char = Value_A - 80;
            int First_char = Value_A - 80 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +7;
            }
            System.out.println("Range 80 - 89");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A >= 90 && Value_A <= 99) {
            int Second_char = Value_A - 90;
            int First_char = Value_A - 90 - (Second_char - 1);
            if (First_char == 1){
                First_char = First_char +8;
            }
            System.out.println("Range 90 - 99");
            System.out.println("Output : " + Second_char + " " + First_char);
        } else if (Value_A < 10 | Value_A >= 100){
            System.out.println("Entered value out of range");
        }
        Scanner_Input.close();
    }
}
/* Как по мне, не много топорно вышло, но придумал пока такой вариант*/