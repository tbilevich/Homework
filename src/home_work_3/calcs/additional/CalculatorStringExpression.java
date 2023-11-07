package home_work_3.calcs.additional;


import home_work_3.calcs.api.ICalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
public class CalculatorStringExpression{
    private int pos;
    private String[] tokens;
    private ICalculator calc;

    /**
     * Конструктор инициализирует вновь созданный объект CalculatorStringExpression
     *
     * @param calc - интерфейс ICalculator
     */
    public CalculatorStringExpression(ICalculator calc) {
        this.calc = calc;
    }


    /**
     * Метод вычисления выражения заданного строкой
     *
     * @param str - передаваемое выражение в виде строки
     * @return - возвращает результат выражения
     */
    public double calculate(String str) {
        pos = 0;
        tokens = str.replaceAll(" ", "").split("");
        validate();
        double result = calculatePlusMinusExpression();

        if (pos != tokens.length) {
            throw new IllegalStateException("Incorrect expression! Something was lost in expression or expression has prohibited symbols.");
        }
        return result;
    }

    /**
     * Метод вычитания или сложения элементов выражения
     *
     * @return - возвращает результат вычитания или сложения
     */
    // calculatePlusMinusExpression -> calculateMultDivExponExpression ( + | - ) calculateMultDivExponExpression ( + | - ) ...
    private double calculatePlusMinusExpression() {
        // находим слагаемое/уменьшаемое
        double first = calculateMultDivExponExpression();

        while (pos < tokens.length) {
            String operator = getToken();

            if (!operator.equals("+") && !operator.equals("-")) {
                break;
            }
            pos++;

            // находим слагаемое/вычитаемое
            double second = calculateMultDivExponExpression();

            // вычисляем
            if (operator.equals("+")) {
                first = calc.addition(first, second);
            } else {
                first = calc.subtraction(first, second);
            }
        }
        return first;
    }

    /**
     * Метод умножения, или деления, или возведения в степень элементов выражения
     *
     * @return - возвращает результат умножения, или деления, или возведения в степень
     */
    // calculateMultDivExponExpression -> factor ( * | / | ^ ) factor ( * | / | ^ ) ...
     private double calculateMultDivExponExpression() {
        // находим множитель/делимое/основание
        double first = getFactor();

        while (pos < tokens.length) {
            String operator = getToken();

            if (!operator.equals("*") && !operator.equals("/") && !operator.equals("^")) {
                break;
            }
            pos++;

            // находим множитель/делитель/cтепень
            double second = getFactor();

            // вычисляем
            if (operator.equals("*")) {
                first = calc.multiplication(first, second);
            } else if (operator.equals("/")) {
                first = calc.division(first, second);
            } else {
                first = calc.exponentiation(first, second);
            }
        }
        return first;
    }

    /**
     * Метод получения множителя
     *
     * @return - возвращает результат действия в скобках, или в модуле, или число
     */
    // getFactor -> number | ( expression ) | | expression |
    private double getFactor() {
        String currentSymbol = getToken();

        if (currentSymbol.equals("(")) {
            return calculateBracketExpression();
        } else if (currentSymbol.equals("|")) {
            return calculateModuleExpression();
        } else {
            return getNumber();
        }
    }

    /**
     * Метод вычисления выражения в скобках
     *
     * @return - возвращает результат действия в скобках
     */
    private double calculateBracketExpression() {
        pos++;
        double result = calculatePlusMinusExpression();
        String closingBracket = getToken();

        if (closingBracket.equals(")")) {
            pos++;
            return result;
        }
        throw new IllegalStateException("Incorrect expression! Something was lost in expression or expression has prohibited symbols.");
    }

    /**
     * Метод вычисления выражения в модуле
     *
     * @return - возвращает результат действия в модуле
     */
    private double calculateModuleExpression() {
        pos++;
        String currentSymbol = getToken();

        if (currentSymbol.equals("-")) {
            pos++;
        }
        double result = calculatePlusMinusExpression();
        String closingModule = getToken();

        if (closingModule.equals("|")) {
            pos++;
            return result;
        }
        throw new IllegalStateException("Incorrect expression! Something was lost in expression or expression has prohibited symbols.");
    }

    /**
     * Метод получения элемента выражения, которое является числлом
     *
     * @return - возвращает число
     */
    private double getNumber() {
        List<String> arrayDigits = new ArrayList<>();
        arrayDigits.add(getToken());

        while (++pos < tokens.length) {
            String currentSymbol = getToken();

            if (!currentSymbol.equals(".") && !Character.isDigit(currentSymbol.charAt(0))) {
                break;
            } else {
                arrayDigits.add(currentSymbol);
            }
        }
        String strDigits = String.join("", arrayDigits);
        return Double.parseDouble(strDigits);
    }

    /**
     * Метод получения токена для текущей позиции
     *
     * @return - возвращает токен в текущей позиции
     */
    private String getToken() {

        if (pos < tokens.length) {
            return tokens[pos];
        } else {
            throw new IllegalStateException("Incorrect expression! Something was lost in expression or expression has prohibited symbols.");
        }
    }

    /**
     * Метод проверки заданной строки на содержание запрещенных символов
     */
    private void validate() {
        List<String> allowableSymbols = Arrays.asList("(", ")", "|", ".", "+", "-", "*", "/", "^");

        for (String token : tokens) {

            if (!Character.isDigit(token.charAt(0)) && !allowableSymbols.contains(token)) {
                throw new IllegalStateException("Incorrect expression! Something was lost in expression or expression has prohibited symbols.");
            }
        }
    }
}