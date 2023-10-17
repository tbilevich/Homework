package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * Создать класс CalculatorWithCounterClassic.
 * 	5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик (поле) в калькуляторе.
 * 	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора (поле).
 * 	5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * 	калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно
 * 	вызывать метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic(); // Создание экземпляра кальтулятора

        double div = calc.division(28, 5);
        calc.incrementCountOperation();
        double exp = calc.exponentiation(div, 2);
        calc.incrementCountOperation();
        double mult = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double sum = calc.addition(mult, exp);
        calc.incrementCountOperation();
        double result = calc.addition(4.1, sum);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("The number of uses of this calculator is " + calc.getCountOperation());
    }
}
