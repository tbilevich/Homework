package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Написать класс CalculatorStringExpression. Данное задание направлено на изучение паттера Адаптер.
 * 14.0 О адаптерах можно прочитать по ссылкам:
 * 14.0.1 https://refactoring.guru/ru/design-patterns/adapter
 * 14.0.2 https://www.wikiwand.com/ru/%D0%90%D0%B4%D0%B0%D0%BF%D1%82%D0%B5%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
 * 14.1 реализующий разбор (парсинг) СТРОКИ с математическим выражением:
 * 14.2 Класс должен понимать операторы: + - \ * ^ ||
 * 14.3 Класс должен понимать ( )
 * 14.4 Класс должен строго учитывать приоритеты в данном выражении
 * 14.5 Класс должен уметь парсить в строке константные значение: PI, E (Экспонента)
 * 14.6 Класс должен контролировать что в строке могут быть только допустие символы (числа, операторы, скобки, константы)
 * 14.7 Класс должен контролировать чтобы выражение было валидным (2 + 2 - хорошо, 2 + - плохо)
 * 14.8 Создать класс CalculatorStringExpressionMain в котором будет точка входа (main метод). В main методе требуется создать
 * экземпляр калькулятора CalculatorStringExpression и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат.
 */
public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calc = new CalculatorStringExpression(new CalculatorWithMathExtends());
        String inputExpression = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result = calc.calculate(inputExpression);
        System.out.println(inputExpression + " = " + result);
    }
}
