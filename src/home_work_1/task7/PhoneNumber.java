package home_work_1.task7;

import java.util.Formatter;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] digitsOfNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // создали масссив из 10 элементов
        System.out.println(createPhoneNumber(digitsOfNumber)); // выводим результат работы метода createPhoneNumber
    }

    /**
     * Метод печати номера телефона
     *
     * @param array - массив цифр номера
     * @return - возвращает номер телефона, в противном случае сообщение об ошибке
     */
    public static String createPhoneNumber(int[] array) {
        Formatter f = new Formatter();
        for (int element : array) {
            if (element < 0 || element > 9) {
                return "Incorrect input data!";
            }
        }
        if (array.length != 10) {
            return "Incorrect array length!";
        }
        return f.format("(%d%d%d) %d%d%d-%d%d%d%d", array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], array[9]).toString();
    }
}
