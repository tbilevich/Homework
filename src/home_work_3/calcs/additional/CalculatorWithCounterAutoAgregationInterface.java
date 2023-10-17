package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithCounterAutoAgregationInterface.
 * 11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
 * 11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * 11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного
 * метода счётчик учёта не увеличивается.
 * 11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат
 * метода getCountOperation().
 */
public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator iCalculator;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoAgregationInterface
     *
     * @param calc - интерфейс ICalculator
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
        this.iCalculator = calc;
    }

    private long countOperation;

    /**
     * Метод увеличения счетчика при использование методов калькулятора
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Метод вывода результата счетчика
     *
     * @return - возвращает значение счетчика
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод деления чисел
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    public double division(double dividend, double divisor) {
        incrementCountOperation();
        return this.iCalculator.division(dividend, divisor);
    }

    /**
     * Метод умножения чисел
     *
     * @param multiplicand - умножаемое
     * @param multiplier   -  множитель
     * @return - возвращает произведение
     */
    public double multiplication(double multiplicand, double multiplier) {
        incrementCountOperation();
        return this.iCalculator.multiplication(multiplicand, multiplier);
    }

    /**
     * Метод вычитания чисел
     *
     * @param minuend    - уменьшаемое
     * @param subtrahend - вычитаемое
     * @return - возвращает разность
     */
    public double subtraction(double minuend, double subtrahend) {
        incrementCountOperation();
        return this.iCalculator.subtraction(minuend, subtrahend);
    }

    /**
     * Метод сложения чисел
     *
     * @param firstAddend  - первое слагаемое
     * @param secondAddend - второе слагаемое
     * @return - возвращает сумму
     */
    public double addition(double firstAddend, double secondAddend) {
        incrementCountOperation();
        return this.iCalculator.addition(firstAddend, secondAddend);
    }

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, int power) {
        incrementCountOperation();
        return this.iCalculator.exponentiation(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        incrementCountOperation();
        return this.iCalculator.module(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа или 0, если невозможно извлечь корень
     */
    public double squareRoot(int number) {
        incrementCountOperation();
        return this.iCalculator.squareRoot(number);
    }
}
