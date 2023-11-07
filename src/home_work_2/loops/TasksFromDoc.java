package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
 * 1.5.1. Найти наибольшую цифру натурального числа
 * 1.5.2. Вероятность четных случайных чисел
 * 1.5.3. Посчитать четные и нечетные цифры числа
 * 1.5.4. Ряд Фибоначчи
 * 1.5.5. Вывести ряд чисел в диапазоне с шагом
 * 1.5.6. Переворот числа
 */

public class TasksFromDoc {

    /**
     * Метод поиска наибольшей цифры натурального числа
     *
     * @param number - введенное число в виде строки
     * @return - возвращает наибольшую цифру числа
     */
    private static int maxDigit(String number) {
        int num = Integer.parseInt(number);
        int digit = 0;
        int max = 0;

        while (num > 9) {
            digit = num % 10;

            if (digit > max) {
                max = digit;
                num /= 10;
            } else {
                num /= 10;
            }
        }
        if (digit > max) {
            max = digit;
        }
        return max;
    }

    /**
     * Метод печати сообщения о маскимальной цифры числа
     *
     * @param number - заданное число
     * @return - возвращает сообщение о максимальной цифре числа, в противном случае сообщение об ошибке
     */
    public static String maxDigitPrint(String number) {
        if (naturalNumber(number)) {
            return "Inccorect input data!";
        }
        return "Max digit of the number is " + maxDigit(number);
    }

    /**
     * Метод вероятности четных случайных чисел
     *
     * @return - возращает вероятность четных чисел
     */
    public static double probabilityEvenNum(int num) {
        Random rndm = new Random();

        if (num == 0) {
            return 0;
        }

        // В цикле генерируются 1000 чисел от 0 до 99
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = rndm.nextInt(100);
        }
        return probabilityEvenNum(arr);
    }

    /**
     * Метод вероятности четных чисел для заданного массива
     *
     * @return - возращает вероятность четных чисел
     */
    public static double probabilityEvenNum(int[] arr) {
        int counter = 0;
        int number;

        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int j : arr) {
            number = j;

            if (number % 2 == 0) {
                counter++;
            }
        }
        return 1.0 * (counter * 100) / arr.length;
    }

    /**
     * Метод печати сообщения вероятности четных чисел в массиве
     *
     * @return - возвращает сообщение вероятности четных чисел в массиве
     */
    public static String probabilityEvenNumPrint() {
        return "Probability of even numbers is " + probabilityEvenNum(1000) + "%";
    }

    /**
     * Метод посчета четных и нечетных цифр числа
     *
     * @param number - введенное с консоли число
     * @return - возвращает количество четных цифр числа
     */
    private static int counterEvenAndOddNum(String number) {
        int num = Integer.parseInt(number); // Переводим строку в число
        int counterEvenNum = 0; // Счетчик четных цифр
        int digit = 0;

        while (num > 9) {
            digit = num % 10;

            if (digit % 2 == 0) {
                counterEvenNum++;
            }
            num /= 10;
        }

        if (num % 2 == 0) {
            counterEvenNum++;
        }
        return counterEvenNum;
    }

    /**
     * Метод печати сообщения о количестве четных и нечетных цифр в числе
     *
     * @param number - заданное число
     * @return - возвращает сообщение о количестве четных и нечетных цифр в числе, в противном случае сообщение об ошибке
     */
    public static String counterEvenAndOddNumPrint(String number) {
        if (naturalNumber(number)) {
            return "Inccorect input data!";
        }
        int counterOddNum = number.length() - counterEvenAndOddNum(number);
        return "The number " + number + " consist of " + counterEvenAndOddNum(number) + " even digits and " + counterOddNum + " odd digits";
    }

    /**
     * Метод формирует ряд Фибоначчи
     *
     * @param numberOfElem - введенное с консоли число количества элементов ряда Фибоначчи
     * @return - возвращает ряд Фибоначчи
     */
    private static String fibonacciSeries(int numberOfElem) {
        String fibonya = "";
        int firstTerm = 1;
        int secondTerm = 1;
        int i = 0;

        // Провека заданного количества элементов ряда Фибоначчи
        if (numberOfElem == 1) {
            fibonya += (firstTerm);
        } else if (numberOfElem == 2) {
            fibonya += (firstTerm + " " + secondTerm);
        } else {
            fibonya += (firstTerm + " " + secondTerm + " ");

            // В цикле формируем ряд Фибоначчи, если элементов > 2
            while (i < numberOfElem - 2) {
                int tempVariable = firstTerm;
                firstTerm += secondTerm;
                secondTerm = tempVariable;
                fibonya += (firstTerm + " ");
                i++;
            }
        }
        return fibonya;
    }

    /**
     * Метод печати ряда Фибоначчи
     *
     * @param numberOfElem - количество элесентов ряда Фибоначчи
     * @return - возвращает ряд Фибоначчи в виде строки, в противном случае сообщение об ошибке
     */
    public static String fibonacciSeriesPrint(int numberOfElem) {
        if (numberOfElem > 0) {
            return "Fibonacci series from " + numberOfElem + " elements: " + fibonacciSeries(numberOfElem); // Вывод результата метода fibonacciSeries
        }
        return "Incorrect input data!";
    }

    /**
     * Метод вывода ряда чисел в диапазоне с шагом
     *
     * @param min  - минимальное значеное диапазона
     * @param max  - максимальное значение диапазона
     * @param incr - значение шага
     * @return - возвращает ряд чисел в диапазоне с шагом в виде строки
     */
    private static String rowWithIncrements(int min, int max, int incr) {
        String seriesOfNum = (min + " ");

        while (min <= max) {
            min += incr;

            if (min <= max) {
                seriesOfNum += (min + " ");
            }
        }
        return seriesOfNum;
    }

    /**
     * Метод печати ряда элементов из интервала с заданным шагом
     *
     * @param min  - минимальное значение интервала
     * @param max  - максимальное значение интервала
     * @param incr - значение шага
     * @return - возвращает ряд элементов в виде строки, в противном случае сообщение об ошибке
     */
    public static String rowWithIncrementsPrint(int min, int max, int incr) {
        if (min < max && incr > 0) {
            return "A series of numbers in the range [ " + min + "; " + max + " ] in increments " + incr + " : " + rowWithIncrements(min, max, incr);
        }
        return "Incorrect input data!";
    }

    /**
     * Метод переворота числа
     *
     * @param num - введеное с консоли число
     * @return - возвращает перевернутое число в виде строки
     */
    private static String numberReversal(String num) {
        int numParse = Integer.parseInt(num);
        String str = "";
        int digit = 0;

        while (numParse > 9) {
            digit = numParse % 10;
            str += digit;
            numParse /= 10;
        }
        str += numParse;
        return str;
    }

    /**
     * Метод печати числа наоборот
     *
     * @param number - заданное число
     * @return - возвращает сообщение о числе наоборот, в противном случае сообщение об ошибке
     */
    public static String numberReversalPrint(String number) {
        if (naturalNumber(number)) {
            return "Inccorect input data!";
        }
        return "If write the number " + number + " backwards, get " + numberReversal(number);
    }

    /**
     * Метод проверки принадлежности числа к натуральным
     *
     * @param str - введеная с консоли строка
     * @return - <code>true</code>, если строка не является числом или вещественным числом, и <code>false</code> в противном случае
     */
    private static boolean naturalNumber(String str) {
        boolean hasNotDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) || str.charAt(0) == '0') {
                hasNotDigit = true;
            }
        }
        return hasNotDigit;
    }
}
