package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithMathCopy.
 * 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 3.2 В классе должны присутствовать математические методы:
 * 3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 * 3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны содержать в своём теле вызов библиотеки Math и
 * возврат полученного результата.
 * 3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из
 * данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy(); // Создание экземпляра кальтулятора

        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}

