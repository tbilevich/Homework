package home_work_1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // ������ ������ a ^ b + c ^ (0.5)
        try {
            System.out.print("Input the first number: ");
            int numFirst = in.nextInt(); // ����� ������ �����
            System.out.print("Input the second number: ");
            int numSecond = in.nextInt(); // ����� ������ �����
            System.out.print("Input the third number: ");
            int numThird = in.nextInt(); // ����� ������ �����
            //����� Math.pow �������� a � ������� b
            //����� Math.sqrt �������� ���������� ������ �� �
            //����� Math.addExact ������������ �� �����, � � ������������ ���� int � long (����� ������ � ����������� � ������ ����)
            double example = Math.pow(numFirst, numSecond) + Math.sqrt(numThird);
            System.out.printf("The example %d ^ %d + %d ^ (0.5) is equal to %.3f \n", numFirst, numSecond, numThird, example);
        } catch (InputMismatchException e){
            // ��� ����� ����������� ������ ��� ���� ���������, ��������� ����� ������ InputMismatchException
            System.out.println("Incorrect input data!"); // � ������� ���������� � ��������������� ��������� ������
        }
        in.close();
    }
}
