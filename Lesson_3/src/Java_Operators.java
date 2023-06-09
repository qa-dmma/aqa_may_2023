import java.util.Scanner;

public class Java_Operators {
    public static void main(String[] args) {

        Scanner Scanner_inputValue_A = new Scanner(System.in);
        System.out.println("Enter value 'A': ");
        int Value_A = Scanner_inputValue_A.nextInt();
        Scanner Scanner_inputValue_B = new Scanner(System.in);
        System.out.println("Enter value 'B': ");
        int Value_B = Scanner_inputValue_B.nextInt();
        int SumValues = Value_A + Value_B;
        int SubValues = Value_A - Value_B;
        int MultiValues = Value_A * Value_B;
        float DivValues = (float) Value_A / Value_B;
        System.out.println("Additions 'A' + 'B': "+SumValues);
        System.out.println("Substraction 'A' - 'B': "+SubValues);
        System.out.println("Multiplication 'A' * 'B': "+MultiValues);
        System.out.println("Division 'A' / 'B': "+DivValues);
    }
}
