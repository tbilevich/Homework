package home_work_1.task4;

import java.util.Scanner;

public class DivisibilityTwoNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int numFirst = in.nextInt(); // вводим первое число
        System.out.print("Input the second number: ");
        int numSecond = in.nextInt(); //вводим второе число

        System.out.println(divisibilityCheck(numFirst, numSecond));
        in.close();
    }

    /**
     * Метод проверки делимости двух чисел
     *
     * @param numFirst  - первое число
     * @param numSecond - второе число
     * @return - возвращает строку о делимости или неделимости чисел
     */
    public static String divisibilityCheck(int numFirst, int numSecond) {
        if (numSecond != 0) {
            if (numFirst % numSecond == 0) {
                return "The numbers are divisible by each other. " + numFirst + " / " + numSecond + " = " + numFirst / numSecond + ".";
            }
            return "The numbers are NOT divisible by each other. The whole part : " + numFirst + " / " + numSecond + " = " + numFirst / numSecond + ". The remains : " + numFirst % numSecond + ".";
        }
        return "Dividing by Zero is undefined.";
    }
}
