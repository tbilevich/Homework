package home_work_1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetterOrSymbol {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = in.nextLine(); // вводим число

        System.out.println(checkLetterOrSymbol(num));
        in.close();
    }

    /**
     * Метод определения буквы или символа по числу
     * @param str - введенное число в виде строки
     * @return - возвращает строки значение числа
     */
    public static String checkLetterOrSymbol(String str) {
        try {
            int num = Integer.parseInt(str);
            if (num < 0) {
                return "Число должно быть положительным.";
            }
            char symbol = (char) num;
            // проверяем, что число попало в промежутки [65;90] и [97;122]
            if ((num > 64 && num < 91) || (num > 96 && num < 123)) {
                return "Число " + num + ", обозначающее код аглийской буквы " + symbol + " по таблице ASCII";
            } else if (num > 127) {
                return "Число " + num + ", обозначающее код символа " + symbol + " по системе международной кодировки Unicode";
            }else {
                return "Число " + num + ", обозначающее код символа " + symbol + " по таблице ASCII";
            }
        } catch (NumberFormatException e) {
            return "Введенны некорректные данные!";
        }
    }
}
