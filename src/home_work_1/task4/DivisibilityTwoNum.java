package home_work_1.task4;

import java.util.Scanner;

public class DivisibilityTwoNum {

    /**
     * Метод проверки делимости двух чисел
     *
     * @param numFirst  - первое число
     * @param numSecond - второе число
     * @return - возвращает строку о делимости или неделимости чисел
     */
    public static String divisibilityCheck(int numFirst, int numSecond) {
        if (numSecond != 0) {
            if (numFirst % numSecond == 0) {
                return "The numbers are divisible by each other. " + numFirst + " / " + numSecond + " = " + numFirst / numSecond + ".";
            }
            return "The numbers are NOT divisible by each other. The whole part : " + numFirst + " / " + numSecond + " = " + numFirst / numSecond + ". The remains : " + numFirst % numSecond + ".";
        }
        return "Dividing by Zero is undefined.";
    }
}
