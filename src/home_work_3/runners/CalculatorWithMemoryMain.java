package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
 * 	12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его дополнительной функцией
 * 	памяти. В принципе работает как калькулятор из реальной жизни.
 * 	12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * 	12.5 В классе должны присутствовать математические методы:
 * 		12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	12.6 Функция памяти работает через методы:
 * 		12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров. Данный метод вызывается
 * 		непосредтвенно пользователем, а не автоматический. Пример void save();
 * 		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память перезаписывается.
 * 		Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример double load();
 * 	12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
 * 	12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя
 * 	методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат. В мэйне запрещается использование переменных для хранения
 * 	значений участвующих в просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения из памяти
 * 	записанного значения.
 */
public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithOperator();
        CalculatorWithMemory calcWithOperator = new CalculatorWithMemory(calculator); // Создание экземпляра кальтулятора

        calcWithOperator.division(28, 5);
        calcWithOperator.save();
        calcWithOperator.exponentiation(calcWithOperator.load(), 2);
        calcWithOperator.save();
        calcWithOperator.addition(calcWithOperator.multiplication(15, 7), calcWithOperator.load());
        calcWithOperator.save();
        calcWithOperator.addition(4.1, calcWithOperator.load());
        calcWithOperator.save();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcWithOperator.load());
        System.out.println();

        CalculatorWithMemory calcWithMathCopy = new CalculatorWithMemory(new CalculatorWithMathCopy()); // Создание экземпляра кальтулятора

        calcWithMathCopy.division(28, 5);
        calcWithMathCopy.save();
        calcWithMathCopy.exponentiation(calcWithMathCopy.load(), 2);
        calcWithMathCopy.save();
        calcWithMathCopy.addition(calcWithMathCopy.multiplication(15, 7), calcWithMathCopy.load());
        calcWithMathCopy.save();
        calcWithMathCopy.addition(4.1, calcWithMathCopy.load());
        calcWithMathCopy.save();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcWithMathCopy.load());
        System.out.println();
    }
}
