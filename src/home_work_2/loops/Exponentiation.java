package home_work_2.loops;


import java.util.Scanner;

/**
 * Возведение в степень. Через консоль пользователь вводит два числа.
 * Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 * 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
public class Exponentiation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");

        // Валидация введенного числа на принадлежность к типу Double
        if (!in.hasNextFloat()) {
            System.out.println("Incorrect input data!");
            System.exit(0); // Если не число, выходим из программы
        }
        float num = in.nextFloat(); // Ввод числа с консоли
        in.nextLine(); // Для считывания следующей введенной строки
        System.out.print("Input a degree of a number: ");
        String degree = in.nextLine(); // Ввод числа в виде строки с консоли

        // Вызов метода валидации на проверку принадлежности введенного числа к натуральным числам
        if (naturalNumber(degree)) {
            System.out.println("Inccorect input data!");
            System.exit(0); // Выход из программы
        }

        System.out.printf("%f ^ %s = %f", num, degree, resultOfExponentiation(num, Integer.parseInt(degree)));
    }

    /**
     * Метод проверки принадлежности числа к натуральным
     *
     * @param str - введеная с консоли строка
     * @return - <code>true</code>, если строка не является числом, и <code>false</code> в противном случае
     */
    public static boolean naturalNumber(String str) {
        boolean hasNotDigit = false;

        // Цикл проверяет содержит ли строка что-нибудь кроме цифр
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                hasNotDigit = true;
            }
        }
        return hasNotDigit;
    }

    public static float resultOfExponentiation(float num, int degree) {
        int i = 1;
        float result = 1F;

        // Цикл для возведения числа в степень
        while (i <= degree) {
            result *= num;
            i++;
        }
        return result;
    }
}
