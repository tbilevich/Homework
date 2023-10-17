package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

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
public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calcWithOperator = new CalculatorWithCounterAutoAgregationInterface(calculator); // Создание экземпляра кальтулятора

        double resultCalculatorWithOperator = calcWithOperator.addition(4.1, calcWithOperator.addition(calcWithOperator.multiplication(15, 7), calcWithOperator.exponentiation(calcWithOperator.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalculatorWithOperator);
        System.out.println("The number of uses of this calculator is " + calcWithOperator.getCountOperation());
        System.out.println();

        calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calcWithMathCopy = new CalculatorWithCounterAutoAgregationInterface(calculator); // Создание экземпляра кальтулятора

        double resultCalculatorWithMathCopy = calcWithMathCopy.addition(4.1, calcWithMathCopy.addition(calcWithMathCopy.multiplication(15, 7), calcWithMathCopy.exponentiation(calcWithMathCopy.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalculatorWithMathCopy);
        System.out.println("The number of uses of this calculator is " + calcWithMathCopy.getCountOperation());
        System.out.println();

        calculator = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregationInterface calcWithMathExtends = new CalculatorWithCounterAutoAgregationInterface(calculator); // Создание экземпляра кальтулятора

        double resultCalculatorWithMathExtends = calcWithMathExtends.addition(4.1, calcWithMathExtends.addition(calcWithMathExtends.multiplication(15, 7), calcWithMathExtends.exponentiation(calcWithMathExtends.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + resultCalculatorWithMathExtends);
        System.out.println("The number of uses of this calculator is " + calcWithMathExtends.getCountOperation());
    }
}
