package home_work_2.loops;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Возведение в степень. Через консоль пользователь вводит два числа.
 * Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 * 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
public class Exponentiation {

    /**
     * Метод проверки принадлежности числа к натуральным
     *
     * @param str - введеная с консоли строка
     * @return - <code>true</code>, если строка не является числом, и <code>false</code> в противном случае
     */
    private static boolean naturalNumber(String str) {
        boolean hasNotDigit = false;

        // Цикл проверяет содержит ли строка что-нибудь кроме цифр
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) || str.charAt(0) == '0') {
                hasNotDigit = true;
            }
        }
        return hasNotDigit;
    }

    /**
     * Метод возведения в степень
     *
     * @param num    - основание числа, возводимого в степень
     * @param degree - степень числа
     * @return - возвращает число, результат возведения числа в степень
     */
    private static float resultOfExponentiation(float num, int degree) {
        int i = 1;
        float result = 1F;

        // Цикл для возведения числа в степень
        while (i <= degree) {
            result *= num;
            i++;
        }
        return result;
    }

    /**
     * Метод печати примера
     *
     * @param num    - основание числа, возводимого в степень
     * @param degree - степень числа
     * @return - возвращает строку примера, в противном случае сообщение об ошибке
     */
    public static String print(float num, String degree) {

        if (naturalNumber(degree)) {
            return "Inccorect input data!";
        }
        return num + " ^ " + degree + " = " + resultOfExponentiation(num, Integer.parseInt(degree));
    }
}
