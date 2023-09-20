package home_work_1.task4;

import java.util.Scanner;

public class DivisibilityTwoNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int numFirst = in.nextInt(); // вводим первое число
        System.out.print("Input the second number: ");
        int numSecond = in.nextInt(); //вводим второе число

        // проверка, что делитель не является нулем
        if (numSecond != 0) {
            // выясняем делится ли одно число на другое без остатка
            if (numFirst % numSecond == 0) {
                // если делится без остатка, то находим значение деления
                int result = numFirst / numSecond;
                // выводим сообщение, что делятся введенные числа без остатка
                System.out.printf("The numbers %d and %d are divisible by each other.\n", numFirst, numSecond);
                // выводим результат деления
                System.out.printf("%d / %d = %d", numFirst, numSecond, result);
            // иначе, если остаток есть
            } else {
                // надодим целую часть от деления
                int wholePart = numFirst / numSecond;
                // находим остаток от деления
                int remains = numFirst % numSecond;
                // выводи сообщение, что числа не делятся
                System.out.printf("The numbers %d and %d are NOT divisible by each other.\n", numFirst, numSecond);
                // выводим целую часть от деления
                System.out.printf("The whole part : %d / %d = %d \n", numFirst, numSecond, wholePart);
                // выводим остаток от деления
                System.out.printf("The remains : %d", remains);
            }
        // иначе, если делитель ноль
        } else {
            // ввывод сообщения о невозможности выполнения операции
            System.out.println("Dividing by Zero is undefined.");
        }
        in.close();
    }
}
