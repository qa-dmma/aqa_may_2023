import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter value more than/equal 10 or less/equal 99: ");
        int Value_A = Scanner_Input.nextInt();
        if (Value_A >= 10 && Value_A <= 99){
            int Number = Value_A % 10;
            int Total = Number * (Value_A/10);
            if (Value_A > Total){
                System.out.println("Entered value '"+Value_A+"' more than sum of numbers this value '"+Total+"'");
            } else if (Total > Value_A) {
                System.out.println("Entered value '"+Value_A+"' less than sum of numbers this value '"+Total+"'");
            }
        } else if (Value_A < 10 | Value_A >= 100){
            System.out.println("Entered value out of range");
        }
        Scanner_Input.close();
    }
}
