package home_work_2.loops;

import java.util.Scanner;

/**
 * Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
 * 1.4.1. 3
 * 1.4.2. 188
 * 1.4.3. -19
 * 1.4.4. Да и вообще на любое целочисленное
 */
public class OverflowDuringMultiplication {

    /**
     * Метод перемножения числа до переполнения
     *
     * @param num - введеное число
     * @return - возвращает произведение перемножения числа
     */
    private static long overflowCheck(long num) {
        long temp = num;
        // Цикл проверяет, когда перемножение чисел выйдет за пределы типа Long
        while (num > Long.MIN_VALUE / Math.abs(temp) && num < Long.MAX_VALUE / Math.abs(temp)) {
            num *= (temp);
        }
        return num;
    }

    /**
     * Метод печати сообщения об умножении числа и переполнении типа данных
     *
     * @param num - заданное число
     * @return - возвращает строку сообщения
     */
    public static String print(long num) {
        long a = 1;
        num = a * num;

        // Проверка на ввод 0, 1, -1
        if (num == 0 || num == 1) {
            return "The result of multiplying by " + num + " always is " + num + ". The overflow will never come.";
        } else if (num == -1) {
            return "The result of multiplying by " + num + " always is \u00B11. The overflow will never come.";
        }
        return "The result of multiplying by " + num + " before overflow is " + overflowCheck(num) + ". The result of multiplying by " + num + " after overflow is " + overflowCheck(num) * num + ".";
    }
}
