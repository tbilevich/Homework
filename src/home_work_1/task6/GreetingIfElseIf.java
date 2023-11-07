package home_work_1.task6;

import java.util.Objects;
import java.util.Scanner;

public class GreetingIfElseIf implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {

        if (Objects.equals("Вася", name)) {
            return "Привет!\n Я тебя так долго ждал";
        } else if (Objects.equals("Анастасия", name)) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}
