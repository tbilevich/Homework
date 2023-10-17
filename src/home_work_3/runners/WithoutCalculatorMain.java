package home_work_3.runners;

/**
 * 1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double division = 1.0 * 28 / 5; // результатом будет целая часть от деления, т е 5,6
        int multiplication = 15 * 7; // результат 105
        double exponentiationTwo = division * division; // результат 31,36

        double result = 4.1 + multiplication + exponentiationTwo; // результат 140.46
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
