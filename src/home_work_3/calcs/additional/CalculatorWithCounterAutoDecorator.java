package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
 * 13.1 Отличие от предыдущих CalculatorWithCounterAutoAgregationInterface и CalculatorWithMemory в том что данные классы будут реализовывать интерфейс ICalculator.
 * 13.2 Данный подход позволяет назвать данный классы "Декораторами". Декоратор - это популярный паттерн который позволяет комбинировать и дополнять новыми
 * возможностями объекты (в нашем случае калькуляторы) не меняя код в их классе. Тем самым мы приходим к тому что мы не наследуем классы для их расширения и не
 * привязываемся к реализации конкретного калькулятора. Советую начать гуглить слово "паттерн".
 * 13.3 О декораторах можно прочитать по ссылкам:
 * 13.3.1 https://refactoring.guru/ru/design-patterns/decorator
 * 13.3.2 https://www.wikiwand.com/ru/%D0%94%D0%B5%D0%BA%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
 * 13.4 Добавить в эти классы метод ICalculator getCalculator() который будут возвращать вложенный в них калькулятор.
 * 13.5 Создать класс CalculatorDecoratorMain в котором будет точка входа (main метод). Cоздать переменную типа ICalculator записав в неё новый экземпляр класса
 * CalculatorWithCounterAutoDecorator которому в конструктор был передан новый экземпляр класса CalculatorWithMemoryDecorator которому в конструтор был передан новый
 * экземпляр класса CalculatorWithMathExtends. Используя созданную переменную посчитать выражения из задания 1. Вывести в консоль.
 * 13.6 Вывести количество использований калькулятора.
 * 13.7** Получить перечисленные далее сведения требуется из калькулятора который вам вернёт метод getCalculator(). Данный пункт вам очень поможет выполнить оператор
 * instanceof который нужно использовать в main.
 * 13.7.1 Выполнить метод сохранения последнего расчёта и вывести сохранённое значение.
 */
public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoDecorator
     *
     * @param calc - интерфейс ICalculator
     */
    public CalculatorWithCounterAutoDecorator(ICalculator calc) {
        this.calculator = calc;
    }

    /**
     * Метод возвращает вложенный тип калькулятора
     *
     * @return - возвращает тип калькулятора
     */
    public ICalculator getCalculator() {
        return this.calculator;
    }

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
        return this.calculator.division(dividend, divisor);
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
        return this.calculator.multiplication(multiplicand, multiplier);
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
        return this.calculator.subtraction(minuend, subtrahend);
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
        return this.calculator.addition(firstAddend, secondAddend);
    }

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, double power) {
        incrementCountOperation();
        return this.calculator.exponentiation(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        incrementCountOperation();
        return this.calculator.module(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {
        incrementCountOperation();
        return this.calculator.squareRoot(number);
    }
}
