package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Создать класс CalculatorWithCounterClassic.
 * 5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
 * 5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик (поле) в калькуляторе.
 * 5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора (поле).
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
 * калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно
 * вызывать метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     * Метод увеличения счетчика при использование методов калькулятора
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Метод вывода результата счетчика
     *
     * @return - возвращает значение счетчика
     */
    public long getCountOperation() {
        return countOperation;
    }
}
