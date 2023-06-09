import java.text.DecimalFormat;

public class Task_1 {
    public static void main(String[] args) {
        byte input_value_sm = 10;
        byte input_value_dm = 25;
        float convert_to_dm = (float) (input_value_sm / 2.54);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float pattern_dm = Float.parseFloat(decimalFormat.format(convert_to_dm));
        float convert_to_sm = (float) (input_value_dm * 2.54);
        System.out.println("10 сантиметров в дюймах это - "+pattern_dm);
        System.out.println("25 дюймов в сантиметрах это - "+convert_to_sm);
/*Решил сделать через float так как есть плавающая точка, а т.к. после деления 10 на 2.54 выдает много не нyжных
циферок сделал округление по паттерну (да, выбрал такой вариант :))
 */
        }
    }
