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


        if (numFirst % 2 == 1) {
            System.out.println("The number " + numFirst + " is an odd number.");
        } else {
            System.out.println("The number " + numSecond + " is an odd number.");
        }
        in.close();
    }
}
