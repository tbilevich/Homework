package home_work_2.loops;

import java.util.Scanner;

/**
 * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 * 1.1.1. Используя только цикл
 * 1.1.2.* Используя рекурсию
 */

public class Factorial {
    public static void main(String[] args) {

        // Задаем с консоли число
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        // Валидация введеных данных на принадлежность к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Incorrect input data!");
            System.exit(0); // если не число, выходим из программы
        }
        int num = in.nextInt();

        // Проверка, что введеное число > 0
        if (num <= 0) {
            System.out.println("You entered a negative number or 0!");
            System.exit(0); // если < 0, выходим из программы
        }

        // Вывод результата вызываемого метода
        System.out.printf("%d! is  %s %s \n", num, print(num), factorialOfNum(num));

        if (recursionFactorial(num) == 0) {
            System.out.printf("%d! is  %s The result beyonds the Integer range!", num, print(num));
        } else {
            System.out.printf("%d! is  %s %s ", num, print(num), recursionFactorial(num));
        }
    }

    /**
     * Метод высчитывает факториал числа
     *
     * @param num - введенное с консоли число
     * @return - возвращает строку равную факториалу числа
     */
    public static String factorialOfNum(int num) {
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

    public static String print(int num) {
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
        str += " ="; // Добавляем к уже свормированной строке =
        return str;
    }

    /**
     * Метод рекурсии
     *
     * @param num - введенное с консоли число
     * @return - возвращает число равное факториалу числа
     */

    public static long recursionFactorial(int num) {
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
}
