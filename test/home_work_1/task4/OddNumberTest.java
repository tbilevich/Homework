package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddNumberTest {

    @Test
    @DisplayName("Проверка нечетного числа в двух четных ")
    public void parityCheck() {
        String result = OddNumber.parityCheck(2, 4);
        assertEquals("Numbers of the same parity.", result);
    }

    @Test
    @DisplayName("Проверка наличия одного нечетного числа в двух нечетных ")
    public void parityCheckTwoOddNum() {
        String result = OddNumber.parityCheck(3, 5);
        assertEquals("Numbers of the same parity.", result);
    }

    @Test
    @DisplayName("Проверка первое число нечетное ")
    public void parityCheckFirstOddNum() {
        String result = OddNumber.parityCheck(5, 8);
        assertEquals("The number 5 is an odd number.", result);
    }

    @Test
    @DisplayName("Проверка второе число нечетное ")
    public void parityCheckSecondOddNum() {
        String result = OddNumber.parityCheck(6, 9);
        assertEquals("The number 9 is an odd number.", result);
    }
}
