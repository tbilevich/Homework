package home_work_2.loops;

import java.util.Scanner;

/**
 * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 * 1.1.1. Используя только цикл
 * 1.1.2.* Используя рекурсию
 */

public class Factorial {

    /**
     * Метод высчитывает факториал числа
     *
     * @param num - введенное с консоли число
     * @return - возвращает строку равную факториалу числа, в противном случае сообщение об ошибке
     */
    private static String factorialOfNum(int num) {
        int i;
        long result = 1;
        String str = "";

        // Цикл для перебора всех чисел до заданного числа, где в result сохраняется сам факториал
        for (i = 1; i <= num; i++) {
            result *= i;

            // Делаем проверку на переполнение и формируем строку произведения числе
            if (result > Integer.MAX_VALUE) {
                return "The result beyonds the Integer range!"; // Если переполнение, выводим сообщение
            }
        }
        str = Long.toString(result); // Полученный результат переводим в строку
        return str;
    }

    /**
     * Метод печатает пример заданного факториала
     *
     * @param num - введенное с консоли число
     * @return - возвращает строку примера факторала
     */

    private static String printExpression(int num) {
        String str = "";
        int i;

        // В цикле формируем строку вида 1 * ... * (n - 1) * n
        for (i = 1; i <= num; i++) {
            if (i < num) {
                str += (i + " * ");
            } else {
                str += i;
            }
        }
        str += " = "; // Добавляем к уже свормированной строке =
        return str;
    }

    /**
     * Метод рекурсии
     *
     * @param num - введенное с консоли число
     * @return - возвращает число равное факториалу числа
     */

    private static long recursionFactorial(int num) {
        long result = 1;

        // Когда число num, при вызове рекурсии, достигрет 1, остановим метод
        if (num == 1) {
            return 1;
        }
        result = num * recursionFactorial(num - 1); // Высчитываем факториал используя рекурсию

        // Делаем проверку на переполнение
        if (result > Integer.MAX_VALUE) {
            return 0; // Если переполнение, возвращаем 0
        }
        return result;
    }

    /**
     * Метод печати примера факториала
     *
     * @param num - заданное число
     * @return - возвращает строку примера факториала, в противном случае сообщение об ошибке
     */
    public static String printLoop(int num) {

        if (num < 0) {
            return "You entered a negative number!";
        } else if (num == 0) {
            return "0! is 1";
        }
        return num + "! is  " + printExpression(num) + factorialOfNum(num);
    }

    /**
     * Метод печати примера факториала, вычисляемого при помощи рекурсии
     *
     * @param num - заданное число
     * @return - возвращает строку примера факториала, в противном случае сообщение об ошибке
     */
    public static String printRecursion(int num) {

        if (num < 0) {
            return "You entered a negative number!";
        } else if (num == 0) {
            return "0! is 1";
        } else if (recursionFactorial(num) == 0) {
            return num + "! is  " + printExpression(num) + "The result beyonds the Integer range!";
        } else {
            return num + "! is  " + printExpression(num) + recursionFactorial(num);
        }
    }
}
