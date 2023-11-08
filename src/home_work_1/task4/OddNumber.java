package home_work_1.task4;

import java.util.Scanner;

public class OddNumber {

    /**
     * Метод проветки нечестности числа
     *
     * @param numFirst  - первое число
     * @param numSecond - второе число
     * @return - возвращает строку с нечетным числом, в противном случае, что числа одинаковой четности
     */
    public static String parityCheck(int numFirst, int numSecond) {
        if (numFirst % 2 == 0 && numSecond % 2 == 0) {
            return "Numbers of the same parity.";
        } else if (numFirst % 2 == 1) {
            if (numSecond % 2 == 1) {
                return "Numbers of the same parity.";
            }
            return "The number " + numFirst + " is an odd number.";
        }
        return "The number " + numSecond + " is an odd number.";
    }
}
