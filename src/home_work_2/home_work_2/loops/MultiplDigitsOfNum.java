package home_work_2.loops;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
 * Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 * 1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 * 1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 * 1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

public class MultiplDigitsOfNum {

    /**
     * Метод валидации введенных данных
     *
     * @param strValue - введенная с консоли строка
     * @return <code>true</code>, если строка является числом, и <code>false</code> в противном случае
     */
    public static String print(String strValue) {
        int i;
        boolean hasLetter = false;
        boolean hasDot = false;
        int counterDot = 0;

        for (i = 0; i < strValue.length(); i++) {
            char elem = strValue.charAt(i);
            if (!Character.isDigit(elem) && strValue.charAt(i) != '.') { // Проверка наличия букв в строке
                hasLetter = true; // Если буквы есть, "подымаем флаг"
                break;
            } else if (strValue.charAt(i) == '.') { // Проверка наличия точек в строке
                hasDot = true; // Если точка есть, "подымаем флаг"
                counterDot++; // Подсчет количества точек в строке
            }
        }
        if (hasLetter) { // Если в строке есть буквы
            return "There was inputed not number!";
        } else if (hasDot) { // Если в строке есть точки
            if (counterDot > 1) { // Если точек в строке больше, чем одна
                return "There was inputed not number!";
            } else if (strValue.charAt(strValue.length() - 1) == '.' || strValue.charAt(0) == '.') { // Если точка в строке последняя или первая
                return "There was inputed not number!";
            } else if (strValue.charAt(0) == '0' && strValue.charAt(1) != '.') {
                return "There was inputed not number!";
            } else { // Если в строке только одна точка
                return "There was inputed not integer!";
            }
        } else if (strValue.charAt(0) == '0') { // Если строка начинается на 0
            return "There was inputed not number!";
        }
        return strValue.replace("", " ").trim().replace(" ", " * ") + " = " + multiplDigits(strValue);
    }

    /**
     * Метод произведения всех цифр числа
     *
     * @param str - введенная с консоли строка
     * @return - число произведения всех цифр числа
     */
    private static int multiplDigits(String str) {
        int result = 1;
        int digit = 0;
        int num = Integer.parseInt(str); // Переводим строку в число

        // В цикле разбиваем число на цифры и высчитываем их произведение не включая первуюю цифру
        while (num > 9) {
            digit = num % 10;
            result *= digit;
            num /= 10;
        }
        result *= num; // полученный результат умножаем на первую цифру числа
        return result;
    }
}
