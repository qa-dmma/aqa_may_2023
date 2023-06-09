import java.text.DecimalFormat;

public class Task_2 {
    public static void main(String[] args) {
       int initial_money = 5000;
       int draft_money = 5000;
       float total_money = (initial_money + draft_money);
       float convert_money = total_money / 28;
       float centes = convert_money%1;
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
       float patter_centes = Float.parseFloat(decimalFormat.format(centes));
       patter_centes = patter_centes * 100;
       System.out.println("У Василия есть "+(int)convert_money+" евро и "+(int)patter_centes+" центов на отпуск.");
    }
}
/* Не много усложнил себе задачу: решил вывесли отдельно, после пересчета, евро и центы. Решение нашел снова ж таки
через паттерн. Не стал добавлять еще пару переменных для перевода в инт, воткнул в саут :))
 */