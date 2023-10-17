package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
 * 13.1 Отличие от предыдущих CalculatorWithCounterAutoAgregationInterface и CalculatorWithMemory в том что данные классы будут реализовывать интерфейс ICalculator.
 * 13.2 Данный подход позволяет назвать данный классы "Декораторами". Декоратор - это популярный паттерн который позволяет комбинировать и дополнять новыми
 * возможностями объекты (в нашем случае калькуляторы) не меняя код в их классе. Тем самым мы приходим к тому что мы не наследуем классы для их расширения и не
 * привязываемся к реализации конкретного калькулятора. Советую начать гуглить слово "паттерн".
 * 13.3 О декораторах можно прочитать по ссылкам:
 * 13.3.1 https://refactoring.guru/ru/design-patterns/decorator
 * 13.3.2 https://www.wikiwand.com/ru/%D0%94%D0%B5%D0%BA%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
 * 13.4 Добавить в эти классы метод ICalculator getCalculator() который будут возвращать вложенный в них калькулятор.
 * 13.5 Создать класс CalculatorDecoratorMain в котором будет точка входа (main метод). Cоздать переменную типа ICalculator записав в неё новый экземпляр класса
 * CalculatorWithCounterAutoDecorator которому в конструктор был передан новый экземпляр класса CalculatorWithMemoryDecorator которому в конструтор был передан новый
 * экземпляр класса CalculatorWithMathExtends. Используя созданную переменную посчитать выражения из задания 1. Вывести в консоль.
 * 13.6 Вывести количество использований калькулятора.
 * 13.7** Получить перечисленные далее сведения требуется из калькулятора который вам вернёт метод getCalculator(). Данный пункт вам очень поможет выполнить оператор
 * instanceof который нужно использовать в main.
 * 13.7.1 Выполнить метод сохранения последнего расчёта и вывести сохранённое значение.
 * 13.7.2 Изменить calc путём изменения создаваемого экземпляра на CalculatorWithCounterClassic. Сделать выводы в комментариях зачем нужен instanceof
 */
public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println();

        do {
            if (calc instanceof CalculatorWithCounterAutoDecorator) {
                System.out.println("The number of uses of this calculator is " + ((CalculatorWithCounterAutoDecorator) calc).getCountOperation());
                System.out.println();
                calc = ((CalculatorWithCounterAutoDecorator) calc).getCalculator();
            } else if (calc instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) calc).save();
                System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + ((CalculatorWithMemoryDecorator) calc).load());
                System.out.println();
                calc = ((CalculatorWithMemoryDecorator) calc).getCalculator();
            } else {
                calc = null;
            }
        } while (calc != null);

        calc = new CalculatorWithCounterClassic();
        result = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.exponentiation(calc.division(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println();

        // В данном варианте с использованием калькулытора CalculatorWithCounterClassic, программа дойдет до else, присвоит calc null и выйдет из цикла.
        // instanceof сравнивает типы калькулторов, если типы calc и выбранного калькулятора совпадают, то выполняться определенные действия
        do {
            if (calc instanceof CalculatorWithCounterAutoDecorator) {
                System.out.println("The number of uses of this calculator is " + ((CalculatorWithCounterAutoDecorator) calc).getCountOperation());
                System.out.println();
                calc = ((CalculatorWithCounterAutoDecorator) calc).getCalculator();
            } else if (calc instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) calc).save();
                System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + ((CalculatorWithMemoryDecorator) calc).load());
                System.out.println();
                calc = ((CalculatorWithMemoryDecorator) calc).getCalculator();
            } else {
                calc = null;
            }
        } while (calc != null);
    }
}
