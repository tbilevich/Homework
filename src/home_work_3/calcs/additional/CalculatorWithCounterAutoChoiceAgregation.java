package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithCounterAutoChoiceAgregation.
 * 9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
 * 9.2 В данном классе должны быть следующие варианты конструктора:
 * 9.2.1 Принимающий объект типа CalculatorWithOperator
 * 9.2.2 Принимающий объект типа CalculatorWithMathCopy
 * 9.2.3 Принимающий объект типа CalculatorWithMathExtends
 * 9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору который передали в конструктор.
 * 9.5 В классах должны присутствовать математические методы:
 * 9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод). В main методе требуется:
 * 9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calcWithOperator;
    private CalculatorWithMathCopy calcWithMathCopy;
    private CalculatorWithMathExtends calcWithMathExtends;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoChoiceAgregation
     *
     * @param calc - объект CalculatorWithOperator
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calcWithOperator = calc;
    }

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoChoiceAgregation
     *
     * @param calc - объект CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calcWithMathCopy = calc;
    }

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorWithCounterAutoChoiceAgregation
     *
     * @param calc - объект CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calcWithMathExtends = calc;
    }

    private long countOperation;

    /**
     * Метод увеличения счетчика при использование методов калькулятора
     */
    public void incrementCountOperation() {
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
        if (calcWithOperator != null) {
            return this.calcWithOperator.division(dividend, divisor);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.division(dividend, divisor);
        }
        return this.calcWithMathExtends.division(dividend, divisor);
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
        if (calcWithOperator != null) {
            return this.calcWithOperator.multiplication(multiplicand, multiplier);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.multiplication(multiplicand, multiplier);
        }
        return this.calcWithMathExtends.multiplication(multiplicand, multiplier);
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
        if (calcWithOperator != null) {
            return this.calcWithOperator.subtraction(minuend, subtrahend);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.subtraction(minuend, subtrahend);
        }
        return this.calcWithMathExtends.subtraction(minuend, subtrahend);
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
        if (calcWithOperator != null) {
            return this.calcWithOperator.addition(firstAddend, secondAddend);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.addition(firstAddend, secondAddend);
        }
        return this.calcWithMathExtends.addition(firstAddend, secondAddend);
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
        if (calcWithOperator != null) {
            return this.calcWithOperator.exponentiation(base, power);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.exponentiation(base, power);
        }
        return this.calcWithMathExtends.exponentiation(base, power);
    }

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    public double module(double number) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return this.calcWithOperator.module(number);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.module(number);
        }
        return this.calcWithMathExtends.module(number);
    }

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    public double squareRoot(int number) {
        incrementCountOperation();
        if (calcWithOperator != null) {
            return this.calcWithOperator.squareRoot(number);
        } else if (calcWithMathCopy != null) {
            return this.calcWithMathCopy.squareRoot(number);
        }
        return this.calcWithMathExtends.squareRoot(number);
    }
}
