package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplDigitsOfNumTest {

    @Test
    @DisplayName("Перемножение цифр числа")
    public void multiplDigitsOfNum() {
        assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", MultiplDigitsOfNum.print("181232375"));
    }

    @Test
    @DisplayName("Вещественное число")
    public void realNum() {
        assertEquals("There was inputed not integer!", MultiplDigitsOfNum.print("99.2"));
        assertEquals("There was inputed not integer!", MultiplDigitsOfNum.print("0.2"));
    }

    @Test
    @DisplayName("Слово")
    public void strNum() {
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("Привет"));
    }

    @Test
    @DisplayName("Введенная строка не является числом")
    public void notNum() {
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("10abc"));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("10.abc"));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("10.8.7"));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("0897"));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print(".897"));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("897."));
        assertEquals("There was inputed not number!", MultiplDigitsOfNum.print("08.97"));
    }
}
