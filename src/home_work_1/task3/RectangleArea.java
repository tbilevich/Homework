package home_work_1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Input the width of a rectangle: ");
            int width = in.nextInt(); // ввели ширину прямоугольника
            System.out.print("Input the length of a rectangle: ");
            int length = in.nextInt(); // ввели длину прямоугольника
            //метод Math.addExact сдлелал сложение длины и ширины
            //метод Math.multiplyExact получившийся результат в методе Math.addExact на 2
            int area = Math.multiplyExact(Math.addExact(length, width), 2);
            System.out.printf("The area of the rectangle with length %d and width %d is equal to %d \n", length, width, area);
        } catch (InputMismatchException e){
            // при вводе некоректных данных для этой программы, программа ловит ошибку InputMismatchException
            System.out.println("Incorrect input data!"); // и ввыводи информацию о некорректнности введенных данных
        }
        in.close();
    }
}
