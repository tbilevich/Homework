package home_work_3.calcs.additional;


/**
 * Создать класс CalculatorWithCounterAutoComposite.
 * 7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
 * 7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 7.5 В классах должны присутствовать математические методы:
 * 7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithCounterAutoSuper calculator;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoComposite
     */
    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }

    /**
     * Метод деления чисел
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    public double division(double dividend, double divisor) {
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
        return this.calculator.addition(firstAddend, secondAddend);
    }

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, int power) {
        return this.calculator.exponentiation(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        return this.calculator.module(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {
        return this.calculator.squareRoot(number);
    }

    /**
     * Метод вывода результата счетчика
     *
     * @return - возвращает значение счетчика
     */
    public long getCountOperation() {
        return this.calculator.getCountOperation();
    }
}
