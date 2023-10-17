package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

/**
 * Создать класс CalculatorWithCounterAutoAgregation.
 * 8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать CalculatorWithMathCopy.
 * 8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 8.5 В классах должны присутствовать математические методы:
 * 8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithCounterAutoSuper()); // Создание экземпляра кальтулятора

        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("The number of uses of this calculator is " + calc.getCountOperation());
    }
}
