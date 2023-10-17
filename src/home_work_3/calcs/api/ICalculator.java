package home_work_3.calcs.api;

/**
 * Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api . Можете прогуглить слово API, оно очень универсально. Такие пакеты обычно содержат интерфейсы, перечисления и в некоторых случаях абстрактные классы.
 * 	10.1 В данном интерфейсе должны быть объявлены методы:
 * 		10.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		10.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	10.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах calcs.simple
 */
public interface ICalculator {
    /**
     * Метод деления чисел
     *
     * @param dividend - делимое
     * @param divisor  - делитель
     * @return - возвращает частное
     */
    double division(double dividend, double divisor);

    /**
     * Метод умножения чисел
     *
     * @param multiplicand - умножаемое
     * @param multiplier   -  множитель
     * @return - возвращает произведение
     */
    double multiplication(double multiplicand, double multiplier);

    /**
     * Метод вычитания чисел
     *
     * @param minuend    - уменьшаемое
     * @param subtrahend - вычитаемое
     * @return - возвращает разность
     */
    double subtraction(double minuend, double subtrahend);

    /**
     * Метод сложения чисел
     *
     * @param firstAddend  - первое слагаемое
     * @param secondAddend - второе слагаемое
     * @return - возвращает сумму
     */
    double addition(double firstAddend, double secondAddend);

    /**
     * Метод возведения в степень
     *
     * @param base  - основание
     * @param power - показатель степени
     * @return - возвращает результат возведения в степень
     */
    double exponentiation(double base, double power);

    /**
     * Метод модуля числа
     *
     * @param number - введеное число
     * @return - возвращает модуль числа
     */
    double module(double number);

    /**
     * Метод извлечения квадратного корня из числа
     *
     * @param number - введенное число
     * @return - возвращает корень из числа
     */
    double squareRoot(int number);
}
