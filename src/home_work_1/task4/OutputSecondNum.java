package home_work_1.task4;

import java.util.Scanner;

public class OutputSecondNum {

    /**
     * Метод нахождения среднего по величине значения
     *
     * @param numFirst  - первое число
     * @param numSecond - второе число
     * @param numThird  - третье число
     * @return - возвращает строку со средним по величине числом
     */
    public static String findAverageNumber(int numFirst, int numSecond, int numThird) {
        if (numFirst > numSecond) {
            if (numFirst < numThird) {
                return "The number " + numFirst + " is the second largest number.";
            } else if (numSecond > numThird) {
                return "The number " + numSecond + " is the second largest number.";
            } else
                return "The number " + numThird + " is the second largest number.";
        } else if (numSecond < numThird) {
            return "The number " + numSecond + " is the second largest number.";
        } else {
            if (numThird < numFirst) {
                return "The number " + numFirst + " is the second largest number.";
            } else {
                return "The number " + numThird + " is the second largest number.";
            }
        }
    }
}
