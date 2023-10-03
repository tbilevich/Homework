package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

/**
 * Создать класс SortsMain. Все проверки пишутся в main.
 * 4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата "[Какой массив был до сортировки] ->
 * [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
 * 4.2.2. Для тестов используем предварительно созданные массивы:
 * 4.2.2.1. new int[]{1,2,3,4,5,6}
 * 4.2.2.2. new int[]{1,1,1,1}
 * 4.2.2.3. new int[]{9,1,5,99,9,9}
 * 4.2.2.4. new int[]{}
 * 4.2.2.5. new int[]{6,5,4,3,2,1}
 * 4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива. Вызывая ранее созданный
 * метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
 * 4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
 * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
 */

public class SortsMain {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6}; // Задаем массив
        int[] arrClone = arr.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arr)); // Выводим массив в виде строки
        SortsUtils.sort(arr); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arr)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrClone));// Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrSecond = new int[]{1, 1, 1, 1}; // Задаем массив
        int[] arrSecondClone = arrSecond.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arrSecond)); // Выводим массив в виде строки
        SortsUtils.sort(arrSecond); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrSecond)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrSecondClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrSecondClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrSecondClone)); // Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrThird = new int[]{9, 1, 5, 99, 9, 9}; // Задаем массив
        int[] arrThirdClone = arrThird.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arrThird)); // Выводим массив в виде строки
        SortsUtils.sort(arrThird); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrThird)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrThirdClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrThirdClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrThirdClone)); // Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrForth = new int[]{}; // Задаем массив
        int[] arrForthClone = arrForth.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arrForth)); // Выводим массив в виде строки
        SortsUtils.sort(arrForth); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrForth)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrForthClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrForthClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrForthClone)); // Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrFifth = new int[]{6, 5, 4, 3, 2, 1}; // Задаем массив
        int[] arrFifthClone = arrFifth.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arrFifth)); // Выводим массив в виде строки
        SortsUtils.sort(arrFifth); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrFifth)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrFifthClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrFifthClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrFifthClone)); // Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrSixth = ArraysUtils.arrayRandom(50, 100); // Создаем массив вызывая метод arrayRandom
        int[] arrSixthClone = arrSixth.clone(); // Создаем копию объекта созданного масссива
        System.out.println("An array before sorting: " + Arrays.toString(arrSixth)); // Выводим массив в виде строки
        SortsUtils.sort(arrSixth); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrSixth)); // Выводим отсортированный массив в виде строки
        System.out.println("An array before sorting: " + Arrays.toString(arrSixthClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrSixthClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrSixthClone)); // Выводим отсортированный массив в виде строки
        System.out.println();

        int[] arrSeventh = ArraysUtils.arrayFromConsole();
        int[] arrSeventhClone = arrSeventh.clone();
        System.out.println("An array before sorting: " + Arrays.toString(arrSeventh)); // Выводим массив в виде строки
        SortsUtils.sort(arrSeventh); // Вызываем метод пузырьковой сортировки
        System.out.println("The array after bubble sorting: " + Arrays.toString(arrSeventh));
        System.out.println("An array before sorting: " + Arrays.toString(arrSeventhClone)); // Выводим массив в виде строки
        SortsUtils.shake(arrSeventhClone); // Вызываем метод шейкерной сортировки
        System.out.println("The array after shaker sorting: " + Arrays.toString(arrSeventhClone)); // Выводим отсортированный массив в виде строки
    }
}
