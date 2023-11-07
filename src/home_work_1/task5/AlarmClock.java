package home_work_1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Is it a weekday? (true/false) : ");
        String weekday = in.nextLine(); // определяем рабочий ли день
        System.out.print("Is it a vacation? (true/false) : ");
        String vacation = in.nextLine(); //определяем отпуск это или нет

        System.out.println(printSleepOrNot(weekday, vacation));
        in.close();
    }

    /**
     * Метод парсинга строки
     * @param str - вводимое булеан занчение в виде строки
     * @return - возвращает булеан значение, в противном случа эксепшн
     */
    private static boolean parseToBoolean(String str) {
        if ("true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str)) {
            return Boolean.parseBoolean(str);
        }
        throw new InputMismatchException();
    }

    /**
     * Метод определения выходного дня
     * @param weekday - параметр, является ли день рабочим
     * @param vacation - параметр, является ли день выходным
     * @return - <code>true</code>, если выходной день, и <code>false</code> в противном случае
     */
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    /**
     * Метод определяющий возможность продолжения сна
     * @param weekdayStr - параметр, является ли день рабочим
     * @param vacationStr - параметр, является ли день выходным
     * @return - возвращает сообщение о возможности продолжения сна
     */
    public static String printSleepOrNot(String weekdayStr, String vacationStr) {
        try {
            boolean weekday = parseToBoolean(weekdayStr);
            boolean vacation = parseToBoolean(vacationStr);

            if (sleepIn(weekday, vacation)) {
                return "You can continue to sleep.";
            } else {
                return "You need to go to work.";
            }
        } catch (InputMismatchException e) {
            return "Incorrect input data!";
        }
    }
}
