package home_work_1.task6;

import java.util.Objects;
import java.util.Scanner;

public class GreetingIfElse implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {

        if (Objects.equals("Вася", name) || Objects.equals("Анастасия", name)) {
            if (Objects.equals("Вася", name)) {
                return "Привет!\n Я тебя так долго ждал";
            }
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}
