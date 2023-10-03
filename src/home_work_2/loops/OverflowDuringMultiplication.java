package home_work_2.loops;

import java.util.Scanner;

/**
 * Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
 * 1.4.1. 3
 * 1.4.2. 188
 * 1.4.3. -19
 * 1.4.4. Да и вообще на любое целочисленное
 */
public class OverflowDuringMultiplication {
    public static void main(String[] args) {
        long a = 1; // Объявление переменной а со значением 1 никакой роли не сыграет(если только потребует больше памяти), но может изменить ситуацию, если это значение поменять
        long numFirst = a * 3;
        System.out.printf("The result of multiplying by %d before overflow is %d \n", numFirst, overflowСheck(numFirst)); // Вызов метода перемножения числа до переполнения
        System.out.printf("The result of multiplying by %d after overflow is %d \n", numFirst, overflowСheck(numFirst) * numFirst); // Результат метода overflowСheck умножаем еще раз на число, чтобы произошло переполнение
        System.out.println();

        long numSecond = a * 188;
        System.out.printf("The result of multiplying by %d before overflow is %d \n", numSecond, overflowСheck(numSecond)); // Вызов метода перемножения числа до переполнения
        System.out.printf("The result of multiplying by %d after overflow is %d \n", numSecond, overflowСheck(numSecond) * numSecond); // Результат метода overflowСheck умножаем еще раз на число, чтобы произошло переполнение
        System.out.println();

        long numThird = a * -19;
        System.out.printf("The result of multiplying by %d before overflow is %d \n", numThird, overflowСheck(numThird)); // Вызов метода перемножения числа до переполнения
        System.out.printf("The result of multiplying by %d after overflow is %d \n", numThird, overflowСheck(numThird) * numThird); // Результат метода overflowСheck умножаем еще раз на число, чтобы произошло переполнение
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer value:");
        // Проверка на ввод данных
        if (!in.hasNextLong()) {
            System.out.println("Input incorrect data!");
            System.exit(0);
        }

        long num = in.nextLong();
        long numForth = a * num;

        // Проверка на ввод 0, 1, -1
        if (numForth == 0 || numForth == 1) {
            System.out.printf("The result of multiplying by %d always is %d. The overflow will never come.\n", numForth, numForth);
            System.out.println();
            System.exit(0);
        } else if (numForth == -1) {
            System.out.printf("The result of multiplying by %d always is \u00B11. The overflow will never come.\n", numForth);
            System.out.println();
            System.exit(0);
        }

        System.out.printf("The result of multiplying by %d before overflow is %d \n", numForth, overflowСheck(numForth)); // Вызов метода перемножения числа до переполнения
        System.out.printf("The result of multiplying by %d after overflow is %d \n", numForth, overflowСheck(numForth) * numForth); // Результат метода overflowСheck умножаем еще раз на число, чтобы произошло переполнение

    }

    /**
     * Метод перемножения числа до переполнения
     *
     * @param num - введеное число
     * @return - возвращает произведение перемножения числа
     */
    public static long overflowСheck(long num) {
        long temp = num;
        // Цикл проверяет, когда перемножение чисел выйдет за пределы типа Long
        while (num > Long.MIN_VALUE / Math.abs(temp) && num < Long.MAX_VALUE / Math.abs(temp)) {
            num *= (temp);
        }
        return num;
    }
}
