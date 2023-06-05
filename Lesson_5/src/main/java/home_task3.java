import java.util.Scanner;

public class home_task3 {
    public static void main(String[] args) {
        Scanner input_value = new Scanner(System.in);
        System.out.println("Enter value");
        int logic_value = Integer.parseInt(input_value.nextLine());
        int count = logic_value;
        while (count != 0){
            count--;
            if (count !=0) {
                logic_value = logic_value * count;
            }
        }
        System.out.println(logic_value);
        input_value.close();
    }
}
