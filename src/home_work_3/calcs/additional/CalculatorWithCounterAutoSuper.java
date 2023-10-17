package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterAutoSuper.
 * 6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 6.2 Данный класс наследует класс CalculatorWithMathExtends.
 * 6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть реализован механизм
 * учёта их использования (учёт общий для всех методов класса), а вместо реализации математики при помощи ключевого слова super вызывает
 * данный метод у родителя. Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения. Внутри метода plus()
 * пишем реализацию учета, а после делаем вызов super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
 * 6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове
 * данного метода счётчик учёта не увеличивается.
 * 6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений
 * и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
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
     * Метод деления чисел. Увеличение счетчика использовани калькулятора на 1
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    @Override
    public double division(double dividend, double divisor) {
        incrementCountOperation();
        return super.division(dividend, divisor);
    }

    /**
     * Метод умножения чисел. Увеличение счетчика использовани калькулятора на 1
     *
     * @param multiplicand - умножаемое
     * @param multiplier   -  множитель
     * @return - возвращает произведение
     */
    @Override
    public double multiplication(double multiplicand, double multiplier) {
        incrementCountOperation();
        return super.multiplication(multiplicand, multiplier);
    }

    /**
     * Метод вычитания чисел. Увеличение счетчика использовани калькулятора на 1
     *
     * @param minuend    - уменьшаемое
     * @param subtrahend - вычитаемое
     * @return - возвращает разность
     */
    public double subtraction(double minuend, double subtrahend) {
        incrementCountOperation();
        return super.subtraction(minuend, subtrahend);
    }

    /**
     * Метод сложения чисел. Увеличение счетчика использовани калькулятора на 1
     *
     * @param firstAddend  - первое слагаемое
     * @param secondAddend - второе слагаемое
     * @return - возвращает сумму
     */
    public double addition(double firstAddend, double secondAddend) {
        incrementCountOperation();
        return super.addition(firstAddend, secondAddend);
    }

    /**
     * Метод возведения в степень. Увеличение счетчика использовани калькулятора на 1
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    public double exponentiation(double base, int power) {
        incrementCountOperation();
        return super.exponentiation(base, power);
    }

    /**
     * Метод модуля числа. Увеличение счетчика использовани калькулятора на 1
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        incrementCountOperation();
        return super.module(number);
    }

    /**
     * Метод извлечения квадратного корня из числа. Увеличение счетчика использовани калькулятора на 1
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {
        incrementCountOperation();
        return super.squareRoot(number);
    }
}
