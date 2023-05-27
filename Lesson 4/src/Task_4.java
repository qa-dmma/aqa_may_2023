import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter value more than/equal 10 or less/equal 99: ");
        int Value_A = Scanner_Input.nextInt();
        int Value_B = Value_A;
        if (Value_A >= 10 && Value_A <= 99){
                while (Value_B > 10){
                    Value_B = Value_B - 10;
                 }
                 if (Value_B == 10 || Value_B == 20 || Value_B == 30 || Value_B == 40 || Value_B == 50 || Value_B == 60
                 || Value_B == 70 || Value_B == 80 || Value_B == 90){
                     Value_B = 0;
                 }
                 System.out.println("Output: "+(Value_A-Value_B)+"+"+Value_B);
        } else if (Value_A < 10 | Value_A >= 100){
            System.out.println("Entered value out of range");
        }
        Scanner_Input.close();
    }
}
/* Придумал более элегантное решение :) В этой задаче принцип такой же как и в 3 задаче но если использовать цикл то код
сокращается в разы, не это больше нравиться пусть мы еще и не проходили эту тему ^^
 */