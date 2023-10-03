package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

/**
 * Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 * 2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает
 * у пользователя через консоль.
 * 2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole
 * будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
 * Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
 * 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента.
 * Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа
 * генерировать рандомные числа.
 * 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет
 * создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

public class ArraysUtils {

    /**
     * Метод задания массива через консоль
     *
     * @return - возвращает массив
     */
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of elements: ");

        // Проверка принадлежности введенного числа к типу Int
        if (!in.hasNextInt()) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }
        int num = in.nextInt(); // Ввод числа

        int[] array = new int[num];

        // Цикл для формирования массива из запрашиваемых элементов массива
        for (int i = 0; i < num; i++) {
            System.out.print("Input an element: ");

            // Проверка принадлежности введенного числа к типу Int
            if (!in.hasNextInt()) {
                System.out.println("Inccorect input data!");
                System.exit(0); // Выход из программы
            }
            int element = in.nextInt();
            array[i] = element; // Запись введенного элемента в массив
        }
        return array;
    }

    /**
     * Метод формирования рандомного массива заданной величины
     *
     * @param size              - размер массива
     * @param maxValueExclusion - число до которого генерируются рандомные числа
     * @return - возвращает массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();

        // Цикл формирования массива из рандомных чисел
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }
        return array;
    }
}
