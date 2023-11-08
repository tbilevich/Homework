package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

/**
 * Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while, while, for, foreach.
 * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
 * Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
 * Должно получиться 3 метода:
 * 2.2.1. Вывести все элементы в консоль.
 * 2.2.2. Вывести каждый второй элемент массива в консоль.
 * 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */
public class ArrayIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // Вызов метода задания массива через консоль
        System.out.println();

        System.out.println("All elements of array: " + printElementsOfArray(container)); // Вызов метода вывода всех элементов массива в консоль
        System.out.println();
        System.out.println("Every second elements of array: " + printEverySecondElem(container)); // Вызов метода вывода каждого второго элемента массива
        System.out.println();
        System.out.println("An array in reverse order: " + printArrInReverseOrder(container)); // Вызов метода вывода всех элементов массива в обратном порядке

    }

    /**
     * Метод вывода всех элементов массива в консоль
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку элементов массива
     */
    public static String printElementsOfArray(int[] container) {

        // Проверка длины массива
        if (container.length == 0) {
            return "The array is empty!";
        }
        String str = "";
        int i;

        // Формирование строки элементов массива при помощи цикла for
        for (i = 0; i < container.length; i++) {
            int element = container[i];
            str += element + " ";
        }
        str += "  ";

        i = 0;
        // Формирование строки элементов массива при помощи цикла while
        while (i < container.length) {
            int element = container[i];
            str += element + " ";
            i++;
        }
        str += "  ";

        // Формирование строки элементов массива при помощи цикла foreach
        for (int element : container) {
            str += element + " ";
        }
        str += "  ";

        i = 0;
        // Формирование строки элементов массива при помощи цикла do...while
        do {
            int element = container[i];
            str += element + " ";
            i++;
        } while (i < container.length);

        return str;
    }

    /**
     * Метод вывода каждого второго элемента массива
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех вторых элементов массива
     */
    public static String printEverySecondElem(int[] container) {

        // Проверка длины массива
        if (container.length < 2) {
            return "It is impossible to output the second element of the array when the array length is < 2";
        }
        String str = "";
        int i;

        // Формирование строки всех вторых элементов массива при помощи цикла for
        for (i = 1; i < container.length; i += 2) {
            str += container[i] + " ";
        }
        str += "  ";

        i = 1;
        // Формирование строки всех вторых элементов массива при помощи цикла while
        while (i < container.length) {
            str += container[i] + " ";
            i += 2;
        }
        str += "  ";

        i = 0;
        // Формирование строки всех вторых элементов массива при помощи цикла foreach
        for (int element : container) {
            if (i % 2 == 1) {
                str += element + " ";
            }
            i++;
        }
        str += "  ";

        i = 1;
        // Формирование строки всех вторых элементов массива при помощи цикла do...while
        do {
            str += container[i] + " ";
            i += 2;
        } while (i < container.length);

        return str;
    }

    /**
     * Метод вывода всех элементов массива в обратном порядке
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех элементов массива в обратном порядке
     */
    public static String printArrInReverseOrder(int[] container) {

        // Проверка длины массива
        if (container.length == 0) {
            return "The array is empty!";
        }
        String str = "";
        int i;

        // Формирование строки всех элементов массива в обратном порядке при помощи цикла for
        for (i = container.length - 1; i >= 0; i--) {
            str += container[i] + " ";
        }
        str += "  ";

        i = container.length - 1;
        // Формирование строки всех элементов массива в обратном порядке при помощи цикла while
        while (i >= 0) {
            str += container[i] + " ";
            i--;
        }
        str += "  ";

        String[] reversedArray = new String[container.length];
        int j = container.length - 1;
        // Формирование массива всех элементов введенного массива в обратном порядке при помощи цикла foreach
        for (int element : container) {
            reversedArray[j] = element + "";
            j--;
        }
        str += String.join(" ", reversedArray) + "  "; // Формирование строки полученного при помощи цикла foreach массива

        i = container.length - 1;
        // Формирование строки всех элементов массива в обратном порядке при помощи цикла do...while
        do {
            str += container[i] + " ";
            i--;
        } while (i >= 0);

        return str;
    }
}
