package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithMathExtends.
 * 4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 4.2 Данный класс должен наследовать класс CalculatorWithOperator.
 * 4.3 Условия:
 * 4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены напрямую
 * в классе, а должны быть унаследованы от родительского класса (4.2).
 * 4.3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы
 * должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса (4.2) и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата .
 * 4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    @Override
    public double exponentiation(double base, double power) {
        return Math.pow(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    @Override
    public double module(double number) {
        return Math.abs(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    @Override
    public double squareRoot(int number) {
        return Math.sqrt(number);
    }
}
