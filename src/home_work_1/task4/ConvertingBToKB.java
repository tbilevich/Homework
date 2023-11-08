package home_work_1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertingBToKB {

    /**
     * Метод перевода байтов в килобайты
     *
     * @param value - количество байт
     * @return - возвращает количество килобайт
     */
    private static double convertToKByte(int value) {
        return 1.0 * value / 1024;
    }

    /**
     * Метод перевода килобайты в байтов
     *
     * @param value - количество килобайт
     * @return - возвращает количество байт
     */
    private static int convertToByte(int value) {
        return value * 1024;
    }

    /**
     * Метод печати строки значений при конвертиции
     *
     * @param value         - количество единиц измерения
     * @param unitOfMeasure - единица измерения
     * @return - возвращет строку в зависимости от веденных данных
     */
    public static String print(int value, String unitOfMeasure) {
        if ("byte".equals(unitOfMeasure) || "B".equals(unitOfMeasure)) {
            return value + " byte = " + convertToKByte(value) + " Kbyte";
        } else if ("Kbyte".equals(unitOfMeasure) || "KB".equals(unitOfMeasure)) {
            return value + " Kbyte = " + convertToByte(value) + " byte";
        }
        return "You specified incorrect unit of measurement. You should use 'byte' or 'Kbyte'.";
    }
}
