package home_work_1.task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmClockTest {

    @Test
    @DisplayName("Будний день, не отпуск")
    public void weekdayNotVacation() {
        assertEquals("You need to go to work.", AlarmClock.printSleepOrNot("true", "false"));
    }

    @Test
    @DisplayName("Будний день, отпуск")
    public void weekdayVacation() {
        assertEquals("You can continue to sleep.", AlarmClock.printSleepOrNot("true", "true"));
    }

    @Test
    @DisplayName("Не будний день, отпуск")
    public void notWeekdayVacation() {
        assertEquals("You can continue to sleep.", AlarmClock.printSleepOrNot("false", "true"));
    }

    @Test
    @DisplayName("Не будний день, не отпуск")
    public void notWeekdayNotVacation() {
        assertEquals("You can continue to sleep.", AlarmClock.printSleepOrNot("false", "false"));
    }

    @Test
    @DisplayName("Проверка независимости введенных данных от регистра")
    public void caseIndependent() {
        assertEquals("You can continue to sleep.", AlarmClock.printSleepOrNot("False", "True"));
        assertEquals("You can continue to sleep.", AlarmClock.printSleepOrNot("FALSE", "FALSE"));
        assertEquals("You need to go to work.", AlarmClock.printSleepOrNot("True", "FALSE"));
        assertEquals("You need to go to work.", AlarmClock.printSleepOrNot("true", "False"));
    }

    @Test
    @DisplayName("Проверка соответствия введенных данных типу boolean")
    public void checkBooleanType() {
        assertEquals("Incorrect input data!", AlarmClock.printSleepOrNot("sleep", "True"));
        assertEquals("Incorrect input data!", AlarmClock.printSleepOrNot("FALSE", "null"));
        assertEquals("Incorrect input data!", AlarmClock.printSleepOrNot("56,56", "FALSE"));
        assertEquals("Incorrect input data!", AlarmClock.printSleepOrNot("true", "  "));
    }
}
