package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

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
public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(); // Создание экземпляра кальтулятора

        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("The number of uses of this calculator is " + calc.getCountOperation());
    }
}
