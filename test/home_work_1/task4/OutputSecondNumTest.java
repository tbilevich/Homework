package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputSecondNumTest {

    @Test
    @DisplayName("Первое число является средним числом")
    public void firstNumAverageNum() {
        String result = OutputSecondNum.findAverageNumber(2, 4, 1);
        assertEquals("The number 2 is the second largest number.", result);
    }

    @Test
    @DisplayName("Второе число является средним числом")
    public void secondNumAverageNum() {
        String result = OutputSecondNum.findAverageNumber(5, 4, 3);
        assertEquals("The number 4 is the second largest number.", result);
    }

    @Test
    @DisplayName("Третье число является средним числом")
    public void thirdNumAverageNum() {
        String result = OutputSecondNum.findAverageNumber(4, 8, 6);
        assertEquals("The number 6 is the second largest number.", result);
    }

    @Test
    @DisplayName("Два одинаковых числа, это число является средним")
    public void twoIdentDigitsNum() {
        String result = OutputSecondNum.findAverageNumber(56, 56, 45);
        assertEquals("The number 56 is the second largest number.", result);
    }

    @Test
    @DisplayName("Три одинаковых числа")
    public void threeIdentDigitsNum() {
        String result = OutputSecondNum.findAverageNumber(78, 78, 78);
        assertEquals("The number 78 is the second largest number.", result);
    }
}
