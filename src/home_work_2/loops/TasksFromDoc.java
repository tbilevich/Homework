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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Input a number: ");
        String number = in.nextLine();

        // Вызов метода валидации на проверку принадлежности введенного числа к натуральным числам
        if (naturalNumber(number)) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }

        System.out.println("1.5.1");
        System.out.println(" Max digit of the number is " + maxDigit(number)); // Вывод результата метода maxDigit

        System.out.println("1.5.2");
        System.out.println(" Probability of even numbers is " + probabilityEvenNum() + "%"); // Вывод результата метода probabilityEvenNum

        System.out.println("1.5.3");
        int counterOddNum = number.length() - counterEvenAndOddNum(number); // Подсчет нечетных цифр числа
        System.out.printf(" The number %s consist of %d even digits and %d odd digits \n", number, counterEvenAndOddNum(number), counterOddNum); // Вывод результата метода counterEvenAndOddNum

        System.out.println("1.5.4");
        System.out.print(" Input a number of elements of Fibonacci series: ");

        // Проверка принадлежности введенного числа к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }
        int numberOfElem = in.nextInt();
        // Проверка, что введенное число > 0
        if (numberOfElem > 0) {
            System.out.printf(" Fibonacci series from %d elements: %s\n", numberOfElem, fibonacciSeries(numberOfElem)); // Вывод результата метода fibonacciSeries
        } else {
            System.out.println(" Incorrect input data!");
        }

        System.out.println("1.5.5");
        System.out.print(" Input a min number: ");

        // Проверка принадлежности введенного числа к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }
        int min = in.nextInt();
        System.out.print(" Input a max number: ");

        // Проверка принадлежности введенного числа к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }
        int max = in.nextInt();
        System.out.print(" Input an increments: ");

        // Проверка принадлежности введенного числа к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }
        int incr = in.nextInt();

        // Проверка валидности введенных данных
        if (min < max && incr > 0) {
            System.out.printf(" A series of numbers in the range [ %d; %d ] in increments %d : %s\n", min, max, incr, rowWithIncrements(min, max, incr)); // Вывод результата метода rowWithIncrements
        } else {
            System.out.println(" Incorrect input data!");
        }

        System.out.println("1.5.6");
        System.out.printf("If write the number %s backwards, get %s \n", number, numberReversal(number)); // Вывод результата метода numberReversal

    }

    /**
     * Метод поиска наибольшей цифры натурального числа
     *
     * @param number - введенное число в виде строки
     * @return - возвращает наибольшую цифру числа
     */
    public static int maxDigit(String number) {
        int num = Integer.parseInt(number); // Перевод строки в число
        int digit = 0;
        int max = 0;

        // Разбиваем число на цифры
        while (num > 9) {
            digit = num % 10;

            // Нахождение максимальной цифры
            if (digit > max) {
                max = digit;
                num /= 10;
            } else {
                num /= 10;
            }
        }

        // Проверка первой цифры числа на максимальность
        if (digit > max) {
            max = digit;
        }
        return max;
    }

    /**
     * Метод вероятности четных случайных чисел
     *
     * @return - возращает вероятность четных чисел
     */
    public static double probabilityEvenNum() {
        Random rndm = new Random();
        int counter = 0; // Счетчик четных чисел
        int number;

        // В цикле генерируются 1000 чисел от 0 до 99
        for (int i = 0; i < 1000; i++) {
            number = rndm.nextInt(100);

            // Проверка четности числа
            if (number % 2 == 0) {
                counter++;
            }
        }
        double result = 1.0 * (counter * 100) / 1000; // Формула высчитывания вероятности
        return result;
    }

    /**
     * Метод посчета четные и нечетные цифры числа
     *
     * @param number - введенное с консоли число
     * @return - возвращает количество четных цифр числа
     */
    public static int counterEvenAndOddNum(String number) {
        int num = Integer.parseInt(number); // Переводим строку в число
        int counterEvenNum = 0; // Счетчик четных цифр
        int digit = 0;

        // Разбиваем число на цифры
        while (num > 9) {
            digit = num % 10;

            // Проверка четности цифры
            if (digit % 2 == 0) {
                counterEvenNum++;
            }
            num /= 10;
        }

        // Проверка первой цифры на четность
        if (num % 2 == 0) {
            counterEvenNum++;
        }
        return counterEvenNum;
    }

    /**
     * Метод формирует ряд Фибоначчи
     *
     * @param numberOfElem - введенное с консоли число количества элементов ряда Фибоначчи
     * @return - возвращает ряд Фибоначчи
     */
    public static String fibonacciSeries(int numberOfElem) {
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
     * Метод вывода ряда чисел в диапазоне с шагом
     *
     * @param min  - минимальное значеное диапазона
     * @param max  - максимальное значение диапазона
     * @param incr - значение шага
     * @return - возвращает ряд чисел в диапазоне с шагом в виде строки
     */
    public static String rowWithIncrements(int min, int max, int incr) {
        String seriesOfNum = (min + " ");

        // В Цикле формируем строку ряда числел
        while (min <= max) {
            min += incr;

            // Проверка выхода из диапазона
            if (min <= max) {
                seriesOfNum += (min + " ");
            }
        }
        return seriesOfNum;
    }

    /**
     * Метод переворота числа
     *
     * @param num - введеное с консоли число
     * @return - возвращает перевернутое число в виде строки
     */
    public static String numberReversal(String num) {
        int numParse = Integer.parseInt(num); // Перевод строки в число
        String str = "";
        int digit = 0;

        // В цикле разбиваем число на цифры и записываем в строку
        while (numParse > 9) {
            digit = numParse % 10;
            str += digit;
            numParse /= 10;
        }
        str += numParse; // Добавляем в строку первую цифру числа
        return str;
    }

    /**
     * Метод проверки принадлежности числа к натуральным
     *
     * @param str - введеная с консоли строка
     * @return - <code>true</code>, если строка не является числом или вещественным числом, и <code>false</code> в противном случае
     */
    public static boolean naturalNumber(String str) {
        boolean hasNotDigit = false;

        // Цикл проверяет содержит ли строка что-нибудь кроме цифр
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                hasNotDigit = true;
            }
        }
        return hasNotDigit;
    }
}
