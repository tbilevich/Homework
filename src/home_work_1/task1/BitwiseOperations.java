package home_work_1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BitwiseOperations {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Для проверки ввода некорректных данных решила использовать конструкцию try-catch
        Где в части try выполняется основной код, как только появляется ошибка InputMismatchException,
        переходим в часть catch.
        Эта ошибка может появиться при вводе данных, которые не входят в указанный тип данных byte
         */
        try {
            System.out.print("Input the first number in the range [-128,127]: "); // 35 в двоичном коде будет 00100011
            byte numFirst = in.nextByte(); // вводим первое число
            System.out.print("Input the second number in the range [-128,127]: "); // 13 в двоичном коде будет 00001101
            byte numSecond = in.nextByte(); // вводим второе число

            int resultBitewiseAnd = numFirst & numSecond;
            /* 00100011 & 00001101 = 00000001 в десятиричной системе счисления это 1.
            Oператор & сравнивает первый бит верхнего числа с первым битом нижнего.
            Результат будет равен 1 только, если оба бита равны 1.
            */
            int resultBitewiseOr = numFirst | numSecond;
            /* 00100011 | 00001101 = 00101111 в десятиричной системе счисления это 47.
            Oператор | сравнивает первый бит верхнего числа с первым битом нижнего.
            Pезультат будет равен 1, если хотя бы один из битов равен 1.
            */
            //выводим результат побитовой И
            System.out.printf("The result of bitwise AND: %d \n", resultBitewiseAnd);
            // выводим результат побитовой ИЛИ
            System.out.printf("The result of bitwise OR: %d ", resultBitewiseOr);

        } catch (InputMismatchException e) {
            // выводим сообщение при некорректности ввода данных
            System.out.println("Incorrect input data!");
        }
        in.close();
    }
}
