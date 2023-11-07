package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    @DisplayName("Год високосный")
    public void checkLeapYear() {
        assertEquals("The year 1996 is a leap year.", LeapYear.defineLeapYear("1996"));
        assertEquals("The year 2072 is a leap year.", LeapYear.defineLeapYear("2072"));
    }

    @Test
    @DisplayName("Год невисокосный")
    public void checkNonLeapYear() {
        assertEquals("The year 1873 is a non-leap year.", LeapYear.defineLeapYear("1873"));
        assertEquals("The year 2085 is a non-leap year.", LeapYear.defineLeapYear("2085"));
    }

    @Test
    @DisplayName("Граничное значение начала использования Григорианского календаря")
    public void checkBoundaryValueGregorianCalendar() {
        assertEquals("The year 1582 is a non-leap year.", LeapYear.defineLeapYear("1582"));
    }

    @Test
    @DisplayName("Использование Юлианского календаря")
    public void checkJulianCalendar() {
        assertEquals("Until 1582, the Julian calendar was used.", LeapYear.defineLeapYear("1581"));
        assertEquals("Until 1582, the Julian calendar was used.", LeapYear.defineLeapYear("456"));
    }

    @Test
    @DisplayName("'Отрицательный' год")
    public void checkNegativeYear() {
        assertEquals("Negative number was entered.", LeapYear.defineLeapYear("-2000"));
        assertEquals("Negative number was entered.", LeapYear.defineLeapYear("-1"));
    }

    @Test
    @DisplayName("Нецифровые введенные данные")
    public void checkNonDigits() {
        assertEquals("Incorrect input data!", LeapYear.defineLeapYear("year"));
        assertEquals("Incorrect input data!", LeapYear.defineLeapYear("null"));
        assertEquals("Incorrect input data!", LeapYear.defineLeapYear("2345.6.7"));
    }

    @Test
    @DisplayName("'Нецелочисленные' год")
    public void checkRealYear() {
        assertEquals("Incorrect input data!", LeapYear.defineLeapYear("2004,4"));
    }
}
