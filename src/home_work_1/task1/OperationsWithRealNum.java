package home_work_1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationsWithRealNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double numFirst = 42.5;
        System.out.printf("The first number is %f \n", numFirst);
        System.out.print("Input the second number in the range [-128,127]: "); // 13 в двоичном коде будет 00001101
        byte numSecond = in.nextByte();

        //double resultBitewiseAnd = numFirst & numSecond;

        /* Будет ошибка компиляции.
           C:\Java\Homework1\src\home_work_1.task1\OperationsWithRealNum.java:16:45
           java: bad operand types for binary operator '&'
           Побитовые операции с вещественными типами не поддерживаются в Java.
           Их невозможно записать в любой другой системе счисления кроме как в десятичной
        */

        //System.out.printf("The result of bitwise AND: %d \n", resultBitewiseAnd);

        in.close();
    }
}
