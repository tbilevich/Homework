package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

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
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper(); // Создание экземпляра кальтулятора

        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("The number of uses of this calculator is " + calc.getCountOperation());
    }
}
