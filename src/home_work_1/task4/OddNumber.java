package home_work_1.task4;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers so that one of them is odd and the other is even");
        System.out.print("Input the first number: ");
        int numFirst = in.nextInt();
        System.out.print("Input the second number: ");
        int numSecond = in.nextInt();

        System.out.println(parityCheck(numFirst,numSecond));
        in.close();
    }

    /**
     * Метод проветки нечестности числа
     *
     * @param numFirst  - первое число
     * @param numSecond - второе число
     * @return - возвращает строку с нечетным числом, в противном случае, что числа одинаковой четности
     */
    public static String parityCheck(int numFirst, int numSecond) {
        if (numFirst % 2 == 0 && numSecond % 2 == 0) {
            return "Numbers of the same parity.";
        } else if (numFirst % 2 == 1) {
            if (numSecond % 2 == 1) {
                return "Numbers of the same parity.";
            }
            return "The number " + numFirst + " is an odd number.";
        }
        return "The number " + numSecond + " is an odd number.";
    }
}
