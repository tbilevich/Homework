package home_work_1.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibilityTwoNumTest {

    @Test
    @DisplayName("Два числа деляться друг на друга")
    public void wholeDivision() {
        assertEquals("The numbers are divisible by each other. 45 / 9 = 5.", DivisibilityTwoNum.divisibilityCheck(45,9));
    }

    @Test
    @DisplayName("Два числа не делятся друг на друга")
    public void fractionalDivision() {
        assertEquals("The numbers are NOT divisible by each other. The whole part : 7 / 2 = 3. The remains : 1.", DivisibilityTwoNum.divisibilityCheck(7,2));
    }

    @Test
    @DisplayName("Деление на ноль")
    public void divisionByZero() {
        assertEquals("Dividing by Zero is undefined.", DivisibilityTwoNum.divisibilityCheck(100,0));
    }
}
