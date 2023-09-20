package home_work_1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Решить пример a ^ b + c ^ (0.5)
        try {
            System.out.print("Input the first number: ");
            int numFirst = in.nextInt(); // ввели первое число
            System.out.print("Input the second number: ");
            int numSecond = in.nextInt(); // ввели второе число
            System.out.print("Input the third number: ");
            int numThird = in.nextInt(); // ввели третье число
            //метод Math.pow возведет a в степень b
            //метод Math.sqrt вычислит квадратный корень их с
            //метод Math.addExact использовать не можем, т к используемые типы int и long (можем только с приведением в данном типу)
            double example = Math.pow(numFirst, numSecond) + Math.sqrt(numThird);
            System.out.printf("The example %d ^ %d + %d ^ (0.5) is equal to %.3f \n", numFirst, numSecond, numThird, example);
        } catch (InputMismatchException e){
            // при вводе некоректных данных для этой программы, программа ловит ошибку InputMismatchException
            System.out.println("Incorrect input data!"); // и ввыводи информацию о некорректнности введенных данных
        }
        in.close();
    }
}
