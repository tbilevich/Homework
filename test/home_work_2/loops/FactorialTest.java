package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    @DisplayName("Факториал числа")
    public void numFactorial() {
        assertEquals("5! is  1 * 2 * 3 * 4 * 5 = 120", Factorial.printLoop(5));
    }

    @Test
    @DisplayName("Факториал нуля")
    public void zeroFactorial() {
        assertEquals("0! is 1", Factorial.printLoop(0));
    }

    @Test
    @DisplayName("Переполнение типа данных")
    public void overflowFactorial() {
        assertEquals("18! is  1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 = The result beyonds the Integer range!", Factorial.printLoop(18));
    }

    @Test
    @DisplayName("Факториал отрицательного числа")
    public void negativeNumFactorial() {
        assertEquals("You entered a negative number!", Factorial.printLoop(-2));
    }

    @Test
    @DisplayName("Факториал числа (рекурсия)")
    public void numFactorialRecursion() {
        assertEquals("5! is  1 * 2 * 3 * 4 * 5 = 120", Factorial.printRecursion(5));
    }

    @Test
    @DisplayName("Факториал нуля (рекурсия)")
    public void zeroFactorialRecursion() {
        assertEquals("0! is 1", Factorial.printRecursion(0));
    }

    @Test
    @DisplayName("Переполнение типа данных (рекурсия)")
    public void overflowFactorialRecursion() {
        assertEquals("18! is  1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 = The result beyonds the Integer range!", Factorial.printRecursion(18));
    }

    @Test
    @DisplayName("Факториал отрицательного числа (рекурсия)")
    public void negativeNumFactorialRecursion() {
        assertEquals("You entered a negative number!", Factorial.printRecursion(-2));
    }
}
