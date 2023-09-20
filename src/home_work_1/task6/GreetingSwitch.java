package home_work_1.task6;

import java.util.Scanner;

public class GreetingSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = in.nextLine(); // вводим имя

        // "запоминаем" строку, которую будем сравнивать
        switch (name) {
            // введенную строку стравниваем со случаем "Вася"
            case "Вася":
                // если истина, то выводим сообщение
                System.out.println("Привет!\nЯ тебя так долго ждал");
                // и выходим из switch
                break;
            // если первый случай был ложь, берем вротой случай "Анастасия"
            case "Анастасия":
                // если сравнение вернуло истину, выводим сообщение
                System.out.println("Я тебя так долго ждал");
                // и выходим из switch
                break;
            // если не случай "Вася" и не случай "Анастасия", переходим в часть default, которая будет отрабатывать в любом другом случае
            default:
                //если не случай "Вася" и не случай "Анастасия", выведется сообщение
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
