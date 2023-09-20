package home_work_1.task4;

import java.util.Scanner;

public class ConvertingBToKB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of units of information: ");
        int num = in.nextInt(); // вводим число
        /* метод nextLine() считывает остаток строки после введенного числа и нажатия Enter,
           а следующий nextLine() уже считает следующую введенную строку
        */
        in.nextLine();
        System.out.print("Select in which units of measurement you specified the number. Input 'byte' or 'Kbyte': ");
        String unitOfMeasure = in.nextLine(); // вводим единицы измерения

        // стравниваем введенную строку со строкой byte
        if ("byte".equals(unitOfMeasure)) {
            // если истина, то переводим в KB
            double resultInKB = 1.0 * num / 1024;
            // вывод сообщения, что n byte равно m Kbyte
            System.out.printf("%d byte = %.10f Kbyte", num, resultInKB);
        // иначе, если введенная сторока не byte, проверяем равна ли она Kbyte или KB
        } else if ("Kbyte".equals(unitOfMeasure) || "KB".equals(unitOfMeasure)) {
            // если истина, то переводим в byte
            int resultInB = num * 1024;
            // вывод сообщения, что m Kbyte равно n byte
            System.out.printf("%d Kbyte = %d byte", num, resultInB);
        //если введенна сторока не byte и не Kbyte bkb KB
        } else {
            // выведем сообщения об ошибке, что ввели некорректную единицу измерения
            System.out.println("You specified incorrect unit of measurement. You should use 'byte' or 'Kbyte'.");
        }
        in.close();
    }
}
