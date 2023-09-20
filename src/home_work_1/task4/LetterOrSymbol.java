package home_work_1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetterOrSymbol {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt(); // вводим число

        // преобразуем тип INT в тип CHAR, в котором определенное число соответствует определенному символу
        char symbol = (char) num;
        /* Для проверки ввода некорректных данных решила использовать конструкцию try-catch
        Где в части try выполняется основной код, как только появляется ошибка InputMismatchException,
        переходим в часть catch.
        Эта ошибка может появиться при вводе данных, которые не входят в указанный тип данных int
         */
        try {
            // проверяем, что число попало в промежутки [65;90] и [97;122]
            if ((num > 64 && num < 91) || (num > 96 && num < 123)) {
                //если истинно, то выводим сообщение, что число num соответствует определенной англ букве
                System.out.printf("Число %d, обозначающее код аглийской буквы %c по таблице ASCII", num, symbol);
                //иначе, если ложь
            } else {
                // выводим сообщение, что число num соответствует определенной символу
                System.out.printf("Число %d, обозначающее код символ %c по таблице ASCII", num, symbol);
            }
        } catch (InputMismatchException e) {
            // выводим сообщение при некорректности ввода данных
            System.out.println("Incorrect input data!");
        }
        in.close();
    }
}
