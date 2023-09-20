package home_work_1.task7;

import java.util.Formatter;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] digitsOfNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // создали масссив из 10 элементов
        System.out.println(createPhoneNumber(digitsOfNumber)); // выводим результат работы метода createPhoneNumber
    }
    /* создали метод createPhoneNumber который будет форматировать введенный массив в формат номера телефона при
    помощи метода format класса Formatter
     */
    public static Formatter createPhoneNumber(int[] n) {
        Formatter f = new Formatter();
        f.format("(%d%d%d) %d%d%d-%d%d%d%d", n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);
        return f;
    }
}
