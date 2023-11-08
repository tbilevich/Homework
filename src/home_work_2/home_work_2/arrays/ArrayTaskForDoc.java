package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Scanner;

/**
 * Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
 * Все задачи в одном классе, в отдельных методах.
 * Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
 * 2.4.1. Сумма четных положительных элементов массива
 * 2.4.2. Максимальный из элементов массива с четными индексами
 * 2.4.3. Элементы массива, которые меньше среднего арифметического
 * 2.4.4. Найти два наименьших (минимальных) элемента массива
 * 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
 * 2.4.6. Сумма цифр массива
 */

public class ArrayTaskForDoc {
    public static final int MAX_VALUE_EXCLUSION = 100; // Задание константы

    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayRandom(50, MAX_VALUE_EXCLUSION); // Формирование рандомного массива с 50 элементами
        System.out.println(Arrays.toString(container));

        System.out.println("The sum of even positive elements of the array is " + sumEvenPositiveElem(container));
        System.out.println();
        System.out.println("The maximum of the array elements with even indexes is " + findMaxElemEvenIndex(container));
        System.out.println();
        System.out.println("Array elements that are less than the arithmetic mean are/is " + "[ " + findElLessArithmeticMean(container) + "]");
        System.out.println();
        System.out.println("The two smallest (minimum) elements of the array are " + findTwoMinEl(container));
        System.out.println();
        System.out.println("Array with deleted elements: " + removeElArrFromRange(container));
        System.out.println();
        System.out.println("The sum of the digits of the array is " + sumDigitsInArr(container));
    }

    /**
     * Метод суммы четных положительных элементов массива
     *
     * @param container - созданный рандомно массив
     * @return - возвращает сумму положительных элементов массива
     */
    public static int sumEvenPositiveElem(int[] container) {
        int sum = 0;

        // В цикле находим положительные элементы массива и складываем их
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > 0) {
                sum += container[i];
            }
        }
        return sum;
    }

    /**
     * Метод нахождения максимального из элементов массива с четным индексом
     *
     * @param container - созданный рандомно массив
     * @return - возвращает максимальный элемент массива с четным индексом
     */
    public static int findMaxElemEvenIndex(int[] container) {
        int maxElement = 0;

        // В цикле пробегаем массив с шагом 2 и определяем максимальный элемент
        for (int i = 0; i < container.length; i += 2) {
            if (container[i] > maxElement) {
                maxElement = container[i];
            }
        }
        return maxElement;
    }

    /**
     * Метод нахождения элементов массива, которые меньше среднего арифметического
     *
     * @param container - созданный рандомно массив
     * @return - возвращает строку элементов массива, которые меньше среднего арифметического
     */
    public static String findElLessArithmeticMean(int[] container) {
        int sum = 0;

        // Нахождение суммы всех элементов массива
        for (int i = 0; i < container.length; i++) {
            sum += container[i];
        }
        double arithmeticMean = 1.0 * sum / container.length; // Вычисление среднего арифметического
        String strElLessArithmMean = "";

        // Формирование строки из элементов массива, которые меньше среднего арифметического
        for (int i = 0; i < container.length; i++) {
            if (container[i] < arithmeticMean) {
                strElLessArithmMean += container[i] + " ";
            }
        }
        return strElLessArithmMean;
    }

    /**
     * Метод нахождения двух наименьших (минимальных) элемента массива
     *
     * @param container - созданный рандомно массив
     * @return - возвращает строку, состоящую из двух наименьших элементов массива
     */
    public static String findTwoMinEl(int[] container) {
        String strTwoMinEl = "";
        int min = MAX_VALUE_EXCLUSION;
        int index = 0;

        if (container.length < 2) {
            return "The array have to contain two or more elements.";
        }

        // Нахождение минимального значения масива и запоминание его индекса
        for (int i = 0; i < container.length; i++) {
            if (container[i] < min) {
                min = container[i];
                index = i;
            }
        }
        int minTwo = MAX_VALUE_EXCLUSION;
        // Нахождение второго минимального значения массива
        for (int i = 0; i < container.length; i++) {
            // Сравнение не является ли второе минимальное значение уже найденым первым минимальным значением
            if (container[i] < minTwo && index != i) {
                minTwo = container[i];
            }
        }
        strTwoMinEl = min + " and " + minTwo; // Формирование строки из двух минимальных значений
        return strTwoMinEl;
    }

    /**
     * Метод сжатия массива, удалив элементы, принадлежащие интервалу
     *
     * @param container - созданный рандомно массив
     * @return - возращаем получившийся массив в виде строки
     */
    private static String removeElArrFromRange(int[] container) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input min element of range: ");

        // Проверка вводимых данных
        if (!in.hasNextInt()) {
            return "Incorrect input data!";
        }
        int minElOfRange = in.nextInt(); // Ввод минимального значения интервала
        System.out.print("Input max element of range: ");

        // Проверка вводимых данных
        if (!in.hasNextInt()) {
            return "Incorrect input data!";
        }
        int maxElOfRange = in.nextInt(); // Ввод максимального значения интервала

        return removeElArrFromRange(container, minElOfRange, maxElOfRange);
    }

    /**
     * Метод сжатия массива, удалив элементы, принадлежащие интервалу
     *
     * @param container - созданный рандомно массив
     * @param minElOfRange - минимальное значение интервала
     * @param maxElOfRange - максимальное значение интервала
     * @return - возращаем получившийся массив в виде строки
     */
    public static String removeElArrFromRange(int[] container, int minElOfRange, int maxElOfRange) {
        // Проверка валидности заданного интервала
        if (minElOfRange > maxElOfRange) {
            return "Incorrect input data!";
        }
        int counterEl = 0; // использование counterEl уменьшит объем используемой памяти в больших массива при большом попадании элементов массива в диапазон, т к последние нули не будут смещаться
        int i = 0;

        // Проход по массиву пока сумма iого элемета и количества элемнтов, попавших в интервал, не будет равна длине массива
        while (i < container.length && i + counterEl != container.length) {
            // Проверка на вход в интервал
            if (container[i] >= minElOfRange && container[i] <= maxElOfRange) {
                // Смещение элементов на один влево
                for (int j = i; j < (container.length - 1) - counterEl; j++) {
                    container[j] = container[j + 1];
                }
                container[(container.length - 1) - counterEl] = 0; // Первый элемент после последнего смещенного заменяем 0
                counterEl++; // Счетчик элементов попавших в интервал
                i--;
            }
            i++;
        }
        return Arrays.toString(container);
    }

    /**
     * Метод нахождения суммы цифр массива
     *
     * @param container - созданный рандомно массив
     * @return - возвращает сумму цифр массива
     */
    public static int sumDigitsInArr(int[] container) {
        int sumDigits = 0;

        for (int i = 0; i < container.length; i++) {
            // Разбиваем каждое число массива на цифры
            if (container[i] > 9) {
                int remainOfDivision = container[i] % 10;
                sumDigits += remainOfDivision;
                container[i] /= 10;
            }
            sumDigits += container[i]; // К сумме прибавляем первую цифру числа
            container[i] /= 10;
        }
        return sumDigits;
    }
}
