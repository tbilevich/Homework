package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
 * 12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его дополнительной функцией
 * памяти. В принципе работает как калькулятор из реальной жизни.
 * 12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * 12.5 В классе должны присутствовать математические методы:
 * 12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 12.6 Функция памяти работает через методы:
 * 12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров. Данный метод вызывается
 * непосредтвенно пользователем, а не автоматический. Пример void save();
 * 12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память перезаписывается.
 * Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример double load();
 * 12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
 * 12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя
 * методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование переменных для хранения
 * значений участвующих в просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения из памяти
 * записанного значения.
 */
public class CalculatorWithMemory {
    private ICalculator iCalculator;
    private double lastResult;
    private double savedValue;
    private double loadedValue;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithMemory
     *
     * @param calc - интерфейс ICalculator
     */
    public CalculatorWithMemory(ICalculator calc) {
        this.iCalculator = calc;
    }

    /**
     * Метод деления чисел
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    public double division(double dividend, double divisor) {
        double result = this.iCalculator.division(dividend, divisor);
        lastResult = result;
        return result;
    }

    /**
     * Метод умножения чисел
     *
     * @param multiplicand - умножаемое
     * @param multiplier   -  множитель
     * @return - возвращает произведение
     */
    public double multiplication(double multiplicand, double multiplier) {
        double result = this.iCalculator.multiplication(multiplicand, multiplier);
        lastResult = result;
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
        double result = this.iCalculator.subtraction(minuend, subtrahend);
        lastResult = result;
        return result;
    }

    /**
     * Метод сложения чисел
     *
     * @param firstAddend  - первое слагаемое
     * @param secondAddend - второе слагаемое
     * @return - возвращает сумму
     */
    public double addition(double firstAddend, double secondAddend) {
        double result = this.iCalculator.addition(firstAddend, secondAddend);
        lastResult = result;
        return result;
    }

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, int power) {
        double result = this.iCalculator.exponentiation(base, power);
        lastResult = result;
        return result;
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        double result = this.iCalculator.module(number);
        lastResult = result;
        return result;
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа или 0, если невозможно извлечь корень
     */
    public double squareRoot(int number) {
        double result = this.iCalculator.squareRoot(number);
        lastResult = result;
        return result;
    }

    /**
     * Метод хранения результата операции
     */
    public void save() {
        savedValue = lastResult;
    }

    /**
     * Метод получения сохраненного значения операции
     *
     * @return - возращает сохраненное значение операции
     */
    public double load() {
        loadedValue = savedValue;
        savedValue = 0;
        return loadedValue;
    }
}
