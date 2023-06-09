import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int Value_A = Scanner_Input.nextInt();
        if (Value_A < 0){
            System.out.println("Entered value '"+Value_A+"' is negative.");
        }
        else if (Value_A == 0){
            System.out.println("Entered value '"+Value_A+" 'is zero.");
        }
        else if (Value_A > 0){
            System.out.println("Entered value '"+Value_A+"' is positive.");
        }
        Scanner_Input.close();
    }
}
