package home_work_1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {

    /**
     * Метод определения високосного года
     * @param str - вводимое число в виде строки
     * @return - возвращает строку
     */
    public static String defineLeapYear(String str) {
        try {
            int year = Integer.parseInt(str);
            if (year < 0) {
                return "Negative number was entered.";
            }
            /* должно выполнять условие високосного года: число должно делиться на 400, тогда високосный, или,
            если не делится на 400, то должно делиться на 4, но при этом не делиться на 100;
            (year > 1582) - григорианский календарь впервые начали использовать 1582 году
             */
            if ((year > 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                return "The year " + year + " is a leap year.";
            } else if (year < 1582 && year > 0) {
                return "Until 1582, the Julian calendar was used.";
            }
            return "The year " + year + " is a non-leap year.";
        } catch (NumberFormatException e) {
            return "Incorrect input data!";
        }
    }
}
