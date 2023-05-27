import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int Value_A = Scanner_Input.nextInt();
        if (Value_A >= 100 && Value_A <= 999){
            Value_A = --Value_A;
            System.out.println("Output : "+Value_A);
        } else if (Value_A <= 99 || Value_A >= 1000) {
            System.out.println("Value "+Value_A+" out of range.");
        }
        Scanner_Input.close();
    }
}
