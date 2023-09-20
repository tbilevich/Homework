package home_work_1.task6;

import java.util.Objects;
import java.util.Scanner;

public class GreetingIfElseIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = in.nextLine(); // вводим имя

        // проверяем введенную строку с "Вася"
        if (Objects.equals("Вася", name)) {
            // если истина, выводим сообщение
            System.out.println("Привет!\nЯ тебя так долго ждал");
        // если строка не равна "Вася", проверяем может она равна "Анастасия"
        } else if (Objects.equals("Анастасия", name)) {
            // если истина, выводим сообщение
            System.out.println("Я тебя так долго ждал");
        // иначе, если и не "Вася" и не "Анастасия"
        } else {
            // выводим сообщение
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
