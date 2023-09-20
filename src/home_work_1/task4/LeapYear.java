package home_work_1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt(); // вводим число

        /* Для проверки ввода некорректных данных решила использовать конструкцию try-catch
        Где в части try выполняется основной код, как только появляется ошибка InputMismatchException,
        переходим в часть catch.
        Эта ошибка может появиться при вводе данных, которые не входят в указанный тип данных int
         */
        try {
            /* должно выполнять условие високосного года: число должно делиться на 400, тогда високосный, или,
            если не делится на 400, то должно делиться на 4, но при этом не делиться на 100;
            (year > 1582) - григорианский календарь впервые начали использовать 1582 году
             */
            if ((year > 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                //если истина, то сообщение, что год високосный
                System.out.println("The year " + year + " is a leap year.");
            //иначе, если введенное год меньше 1582 года
            } else if (year < 1582) {
                //ввывод сообщения, что до 1582 года использовался другой календарь
                System.out.println("Until 1582, the Julian calendar was used.");
            //иначе, если возвращается false при проверке на високосность
            } else {
                //вывод сообщения, что год невисокосный
                System.out.println("The year " + year + " is a non-leap year.");
            }
        } catch (InputMismatchException e) {
            // выводим сообщение при некорректности ввода данных
            System.out.println("Incorrect input data!");
        }
        in.close();
    }
}
