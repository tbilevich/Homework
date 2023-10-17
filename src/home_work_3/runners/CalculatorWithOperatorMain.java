package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать класс CalculatorWithOperator.
 * 2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 2.2 В классе должны присутствовать математические методы:
 * 2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
 * принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 2.3 В методах можно использовать любые арифметические операторы.
 * 2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа"
 * можно воспользоваться библиотекой Math.
 * 2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы
 * из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator(); // Создание экземпляра кальтулятора

        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}