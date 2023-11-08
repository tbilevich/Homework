package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStringExpressionTest {

    private final ICalculator calcInternal = new CalculatorWithMathExtends();
    private final CalculatorStringExpression calc = new CalculatorStringExpression(calcInternal);

    @Test
    @DisplayName("Проверка вычисления выражения")
    public void checkCalculate() {
        assertEquals(4.1 + 15 * 7 + Math.pow(1.0 * 28 / 5,2), calc.calculate("4.1 + 15 * 7 + (28 / 5) ^ 2"));
        assertEquals(4.1 + 15 * 7 - Math.abs(-4) - 2 , calc.calculate("4.1 + 15 * 7 - | - 4 | - 2"));
        assertEquals(4.1 + 15 * 7 - Math.abs(4) - 2 , calc.calculate("4.1 + 15 * 7 - | 4 | - 2"));
    }

    @Test
    @DisplayName("Проверка на корректность выражения")
    public void checkCalculate1() {
        Exception exception = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15 * 7 + (28 / 5) ^ "));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exception.getMessage());

        Exception exceptionSecond = assertThrows(NumberFormatException.class, () -> calc.calculate("4.1 + 15 * 7 - (4 - - (28 / 5) ^ 2)"));
        assertEquals("For input string: \"-\"", exceptionSecond.getMessage());

        Exception exceptionThird = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15 * 7 - 4 - (28 / 5) 2"));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exceptionThird.getMessage());

        Exception exceptionFourth = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15 * 7 - 4 - (28 / 5() ^ 2"));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exceptionFourth.getMessage());

        Exception exceptionFifth = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15 * 7 - ( | - 4 - 2)"));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exceptionFifth.getMessage());
    }

    @Test
    @DisplayName("Проверка на ввод недопустимых символов")
    public void testvalidate() {

        Exception exception = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15a * 7b"));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exception.getMessage());

        Exception exceptionSecond = assertThrows(IllegalStateException.class, () -> calc.calculate("4.1 + 15 * 7&?~"));
        assertEquals("Incorrect expression! Something was lost in expression or expression has prohibited symbols.", exceptionSecond.getMessage());
    }

}
