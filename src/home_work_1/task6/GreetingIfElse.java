package home_work_1.task6;

import java.util.Objects;
import java.util.Scanner;

public class GreetingIfElse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine(); // вводим имя

        // сравниваем введенную строку с "Вася" и "Анастасия", если одно из них истина, идем в следующий if
        if (Objects.equals("Вася", name) || Objects.equals("Анастасия", name)) {
            // проверяем Вася ли это
            if (Objects.equals("Вася", name)) {
                // если истино, выводим сообщение Привет!
                System.out.println("Привет!");
            }
                /* если Вася, то после сообщения Привет! выводим следующее сообщение
                если Анастасия, if на проверку Васи возвращает false, значит просто выводим следующее сообщение
                */
            System.out.println("Я тебя так долго ждал");
            // иначе, если это не Вася и не Анаястасия
        } else {
            // выводим следующее сообщение
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
