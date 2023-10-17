package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
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
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calcWithOperator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator()); // Создание экземпляра кальтулятора

        double resultCalcWithOperator = calcWithOperator.addition(4.1, calcWithOperator.addition(calcWithOperator.multiplication(15, 7), calcWithOperator.exponentiation(calcWithOperator.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalcWithOperator);
        System.out.println("The number of uses of this calculator is " + calcWithOperator.getCountOperation());
        System.out.println();

        CalculatorWithCounterAutoChoiceAgregation calcWithMathCopy = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy()); // Создание экземпляра кальтулятора

        double resultCalcWithMathCopy = calcWithMathCopy.addition(4.1, calcWithMathCopy.addition(calcWithMathCopy.multiplication(15, 7), calcWithMathCopy.exponentiation(calcWithMathCopy.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalcWithMathCopy);
        System.out.println("The number of uses of this calculator is " + calcWithMathCopy.getCountOperation());
        System.out.println();

        CalculatorWithCounterAutoChoiceAgregation calcWithMathExtends = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends()); // Создание экземпляра кальтулятора

        double resultCalcWithMathExtends = calcWithMathExtends.addition(4.1, calcWithMathExtends.addition(calcWithMathExtends.multiplication(15, 7), calcWithMathExtends.exponentiation(calcWithMathExtends.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalcWithMathExtends);
        System.out.println("The number of uses of this calculator is " + calcWithMathExtends.getCountOperation());
    }
}
