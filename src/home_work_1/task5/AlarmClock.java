package home_work_1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Для проверки ввода некорректных данных решила использовать конструкцию try-catch
        Где в части try выполняется основной код, как только появляется ошибка InputMismatchException,
        переходим в часть catch.
        Эта ошибка может появиться при вводе данных, которые не входят в указанный тип данных byte
         */
        try {
            System.out.print("Is it a weekday? (true/false) : ");
            boolean weekday = in.nextBoolean(); // определяем рабочий ли день
            System.out.print("Is it a vacation? (true/false) : ");
            boolean vacation = in.nextBoolean(); //определяем отпуск это или нет

            // обращаемся к методу sleepIn
            if (sleepIn(weekday, vacation)) {
                // если метод возвращает истинну, выводим сообщение, что можно дальше спать
                System.out.println("You can continue to sleep.");
                // если метод возвращает ложь
            } else {
                // выводим сообщение, что надо идти на работу
                System.out.println("You need to go to work.");
            }
        } catch (InputMismatchException e) {
            // выводим сообщение при некорректности ввода данных
            System.out.println("Incorrect input data!");
        }
        in.close();
    }
    /* создаем метод, который будет определять отпуск или выходной день.
    При истине одного из значений будет возвращать true
     */
    static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
}
