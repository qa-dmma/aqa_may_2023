import java.util.Scanner;

public class home_task4 {
    public static void main(String[] args) {
        int a, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        if (input.hasNextInt()){
            a = input.nextInt();
            while (a!=0){
                total += a % 10;
                a /= 10;
            }
            System.out.println(total);
            input.close();
        }
    }
}
