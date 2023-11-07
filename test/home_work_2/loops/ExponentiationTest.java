package home_work_2.loops;

import home_work_1.task7.PhoneNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTest {

    @Test
    @DisplayName("Целое положительное основание и целая положительная степень")
    public void exponentiationIntBaseIntDegree() {
        assertEquals("18.0 ^ 5 = 1889568.0", Exponentiation.print(18, "5"));
    }

    @Test
    @DisplayName("Вещественное положительное основание и целая положительная степень")
    public void exponentiationRealBaseIntDegree() {
        assertEquals("7.5 ^ 2 = 56.25", Exponentiation.print(7.5F, "2"));
    }

    @Test
    @DisplayName("Целое отрицательное основание и целая положительная степень")
    public void exponentiationNegativeIntBaseIntDegree() {
        assertEquals("-8.0 ^ 3 = -512.0", Exponentiation.print(-8, "3"));
    }

    @Test
    @DisplayName("Вещественное отрицательное основание и целая положительная степень")
    public void exponentiationNegativeRealBaseIntDegree() {
        assertEquals("-5.125 ^ 7 = -92866.07", Exponentiation.print(-5.125F, "7"));
    }

    @Test
    @DisplayName("Степень только целая и положительная")
    public void exponentiationIntBaseIntNegativeDegree() {
        assertEquals("Inccorect input data!", Exponentiation.print(7, "-3"));
        assertEquals("Inccorect input data!", Exponentiation.print(-8, "2.5"));
        assertEquals("Inccorect input data!", Exponentiation.print(9.7F, "-1.7"));
        assertEquals("Inccorect input data!", Exponentiation.print(23, "007"));
        assertEquals("Inccorect input data!", Exponentiation.print(-15.8F, "deg123ree"));
        assertEquals("Inccorect input data!", Exponentiation.print(18, "null"));
    }
}
