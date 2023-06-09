import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner Scanner_Input = new Scanner(System.in);
        System.out.println("Enter value more than/equal 10 or less/equal 99: ");
        int Value_A = Scanner_Input.nextInt();
        if (Value_A >= 10 && Value_A <= 99) {
            int Second_char = Value_A % 10;
            int First_char = (Value_A - Second_char)/10;
            System.out.println("Output : " + Second_char + " " + First_char);
            Scanner_Input.close();
        }
    }
}
