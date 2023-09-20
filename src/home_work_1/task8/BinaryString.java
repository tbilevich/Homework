package home_work_1.task8;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        byte num = in.nextByte(); // вводим число

        System.out.println(toBinaryString(num)); // выводим число в двоичной с.с. ввиде строки

    }

    // создали метод toBinaryString, который переводит число из 10ой с.с. в 2ую с.с.
    static String toBinaryString(byte number) {
        int i;
        int n = 8;
        int num = number; // запоминаем введенное число
        byte[] mas = new byte[n]; // создали массив
        // создаем цикл, который переводит число в 2ую с.с. и записывает его в массив
        for (i = 0; i < n; i++) {
            if (number % 2 == 0) {
                mas[i] = 0;
                number /= 2;
            } else {
                mas[i] = 1;
                number /= 2;
            }
        }
        // создаем цикл, который разворачивает массив
        for (i = 0; i < (n / 2); i++) {
            byte temporaryStorage;
            int masLength = mas.length - 1;
            temporaryStorage = mas[i];
            mas[i] = mas[masLength - i];
            mas[masLength - i] = temporaryStorage;
        }
        /* проверяем является ли введенное число отрицательным, если да, выполняем метод reverseCode,
         который возвращает дополнительный код
         */
        if (num < 0) {
            reverseCode(mas);
        }
        // преобразуем массив в строку
        String result = "";
        for (i = 0; i < n; i++) {
            result += mas[i];
        }
        return result;
    }

    static void reverseCode(byte[] mas) {
        int i;
        int n = 8;
        int j = 0;

        // создаем цикл, который меняет 0 на 1, 1 на 0
        for (i = 0; i < n; i++) {
            mas[i] = (byte) (mas[i] ^ 1);
        }

        // создаем цикл, который добавляет 1 к инвертированному массиву
        while (j < n) {
            if (mas[(mas.length - 1) - j] == 1) {
                mas[(mas.length - 1) - j] = 0;
            } else {
                mas[(mas.length - 1) - j] = 1;
                break;
            }
            j++;
        }
    }
}
