package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_4.DataContainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAdditionalTest {

    @ParameterizedTest(name = "{index} -Проверяемый калькулятор = {0}")
    @DisplayName("Проверка результата выражения 4.1 + 15 * 7 + (28 / 5) ^ 2")
    @MethodSource("calculatorProvider")
    public void checkCalculate(ICalculator calc) {
        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        assertEquals(4.1 + 15 * 7 + Math.pow(1.0 * 28 / 5,2), result);
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка деления")
    @MethodSource("calculatorProvider")
    public void checkDivision(ICalculator calc) {
        assertEquals(5, calc.division(25,5));
        assertEquals(0.1111111111111111, calc.division(5,45));
        assertEquals(0, calc.division(0,7));
        assertThrows(RuntimeException.class, () -> calc.division(34,0));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка умножения")
    @MethodSource("calculatorProvider")
    public void checkMultiplication(ICalculator calc) {
        assertEquals(8, calc.multiplication(2,4));
        assertEquals(15.75, calc.multiplication(3.5,4.5));
        assertEquals(0, calc.multiplication(0,0));
        assertEquals(0, calc.multiplication(0,1));
        assertEquals(-5, calc.multiplication(-1,5));
        assertEquals(80, calc.multiplication(-8,-10));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка разности")
    @MethodSource("calculatorProvider")
    public void checkSubtraction(ICalculator calc) {
        assertEquals(10, calc.subtraction(14,4));
        assertEquals(9, calc.subtraction(13.5,4.5));
        assertEquals(0, calc.subtraction(0,0));
        assertEquals(-1, calc.subtraction(0,1));
        assertEquals(-6, calc.subtraction(-1,5));
        assertEquals(18, calc.subtraction(8,-10));
        assertEquals(-8, calc.subtraction(-18,-10));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка сложения")
    @MethodSource("calculatorProvider")
    public void checkAddition(ICalculator calc) {
        assertEquals(18, calc.addition(14,4));
        assertEquals(18.2, calc.addition(13.5,4.7));
        assertEquals(0, calc.addition(0,0));
        assertEquals(1, calc.addition(0,1));
        assertEquals(4, calc.addition(-1,5));
        assertEquals(-2, calc.addition(8,-10));
        assertEquals(-28, calc.addition(-18,-10));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка возведения в степень")
    @MethodSource("calculatorProvider")
    public void checkExponentiation(ICalculator calc) {
        assertEquals(1000, calc.exponentiation(10,3));
        assertEquals(79.50699999999999, calc.exponentiation(4.3,3));
        assertEquals(1, calc.exponentiation(0,0));
        assertEquals(0, calc.exponentiation(0,1));
        assertEquals(1, calc.exponentiation(5,0));
        assertEquals(-1, calc.exponentiation(-1,5));
        assertEquals(0.012345679012345678, calc.exponentiation(9,-2));
        assertEquals(-0.001953125, calc.exponentiation(-8,-3));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка модуля числа")
    @MethodSource("calculatorProvider")
    public void checkModule(ICalculator calc) {
        assertEquals(10.3, calc.module(10.3));
        assertEquals(4, calc.module(4));
        assertEquals(7.6, calc.module(-7.6));
        assertEquals(7, calc.module(-7));
        assertEquals(0, calc.module(0));
    }

    @ParameterizedTest(name = "{index} - Проверяемый калькулятор = {0}")
    @DisplayName("Проверка модуля числа")
    @MethodSource("calculatorProvider")
    public void checkSquareRoot(ICalculator calc) {
        assertEquals(4, calc.squareRoot(16));
        assertEquals(1, calc.squareRoot(1));
        assertEquals(0, calc.squareRoot(0));
        assertEquals(Double.NaN, calc.squareRoot(-25));
    }

    @Test
    @DisplayName("Проверка конструктора CalculatorWithCounterAutoDecorator")
    public void testCalculatorWithCounterAutoDecorator() {
        ICalculator calcInternal = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(calcInternal);
        assertNotNull(calc.getCalculator());
        assertEquals(calcInternal, calc.getCalculator());
    }

    @Test
    @DisplayName("Проверка работы счетчика CalculatorWithCounterAutoDecorator")
    public void testGetCountOperation() {
        ICalculator calcInternal = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(calcInternal);
        assertEquals(0, calc.getCountOperation());
        calc.addition(3,6);
        assertEquals(1, calc.getCountOperation());
        calc.division(25,5);
        assertEquals(2,calc.getCountOperation());
    }

    @Test
    @DisplayName("Проверка конструктора CalculatorWithMemoryDecorator")
    public void testCalculatorWithMemoryDecorator() {
        ICalculator calcInternal = new CalculatorWithOperator();
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(calcInternal);
        assertNotNull(calc.getCalculator());
        assertEquals(calcInternal, calc.getCalculator());
    }

    @Test
    @DisplayName("Проверка получения сохранненого значения при использовании операций CalculatorWithMemoryDecorator")
    public void testLoad() {
        ICalculator calcInternal = new CalculatorWithOperator();
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(calcInternal);
        assertEquals(0, calc.load());
        calc.addition(3,6);
        calc.save();
        assertEquals(9, calc.load());
        calc.division(25,5);
        calc.save();
        assertEquals(5,calc.load());
    }

    private static Stream<Arguments> calculatorProvider() {
        return Stream.of(
                Arguments.of(new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()))),
                Arguments.of(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()))
        );
    }
}
