package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithMathCopy.
 * 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 3.2 В классе должны присутствовать математические методы:
 * 3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 * 3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны содержать в своём теле вызов библиотеки Math и
 * возврат полученного результата.
 * 3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из
 * данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод деления чисел
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    public double division(double dividend, double divisor) {
        double quotient = 0;

        if (divisor == 0) {
            throw new RuntimeException("Dividing by Zero is undefined.");
        }
        quotient = 1.0 * dividend / divisor;
        return quotient;
    }

    /**
     * Метод умножения чисел
     *
     * @param multiplicand - умножаемое
     * @param multiplier   -  множитель
     * @return - возвращает произведение
     */
    public double multiplication(double multiplicand, double multiplier) {
        double result = multiplicand * multiplier;
        return result;
    }

    /**
     * Метод вычитания чисел
     *
     * @param minuend    - уменьшаемое
     * @param subtrahend - вычитаемое
     * @return - возвращает разность
     */
    public double subtraction(double minuend, double subtrahend) {
        double difference = minuend - subtrahend;
        return difference;
    }

    /**
     * Метод сложения чисел
     *
     * @param firstAddend  - первое слагаемое
     * @param secondAddend - второе слагаемое
     * @return - возвращает сумму
     */
    public double addition(double firstAddend, double secondAddend) {
        double sum = firstAddend + secondAddend;
        return sum;
    }

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, double power) {
        return Math.pow(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        return Math.abs(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {
        return Math.sqrt(number);
    }
}
