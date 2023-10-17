package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithOperator.
 * 2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 2.2 В классе должны присутствовать математические методы:
 * 2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
 * принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 2.3 В методах можно использовать любые арифметические операторы.
 * 2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа"
 * можно воспользоваться библиотекой Math.
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы
 * из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithOperator implements ICalculator {

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
        double result = 1;

        if (power > 0) {

            for (int i = 1; i <= power; i++) {
                result *= base;
            }
        } else if (power == 0) {
            result = 1;
        } else {
            double temp = -power;
            double resultTemp = 1;

            for (int i = 1; i <= temp; i++) {
                resultTemp *= base;
            }
            result = 1 / resultTemp;
        }
        return result;
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        return (number < 0) ? -number : number;
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {

        if (number < 0) {
            return Double.NaN;
        } else if (number == 0) {
            return 0.0;
        } else if (number == 1) {
            return 1.0;
        } else {
            double temp;
            double result = number / 2;
            do {
                temp = result;
                result = (temp + (number / temp)) / 2;
            } while ((temp - result) != 0);
            return result;
        }
    }
}
