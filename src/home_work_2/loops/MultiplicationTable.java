package home_work_2.loops;

/**
 * Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int result = 0;

        System.out.println("===== Multiplication table - #1 =====");
        // Формирование и печать первых 4ех столбцов таблицы
        for (int j = 1; j <= 10; j++) {
            for (int i = 2; i < 6; i++) {
                result = i * j;
                print(i, j, result); // Вызов метода печати для каждого примера
            }
            System.out.println();
        }
        System.out.println();
        // Формирование и печать вторых 4ех столбцов таблицы
        for (int j = 1; j <= 10; j++) {
            for (int i = 6; i < 10; i++) {
                result = i * j;
                print(i, j, result); // Вызов метода печати для каждого примера
            }
            System.out.println();
        }

        System.out.println("=====================================");
        System.out.println("===== Multiplication table - #2 =====");

        for (int j = 1; j <= 21; j++) {

            // При доходе до 11 строки, введем переход на следующую строку и продолжим цикл
            if (j == 11) {
                System.out.println();
                continue;
            }

            // Формирование и печать столбцов таблицы.
            for (int i = 1; i <= 4; i++) {
                // Формирование множителей зависит от нахождения до 11 строки или после. Для этого используем тернарный оператор
                int multiplier1 = j < 11 ? i + 1 : i + 5;
                int multiplier2 = j < 11 ? j : j - 11;

                result = multiplier1 * multiplier2;
                print(multiplier1, multiplier2, result); // Вызов метода печати
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }

    /**
     * Метод печати результата перемножения двух чисел
     *
     * @param multiplier1 - первый множитель
     * @param multiplier2 - второй множитель
     * @param result      - результат произведения двух чисел
     */
    private static void print(int multiplier1, int multiplier2, int result) {
        // Формируем строку в зависимости от длины примера умножения двух чисел. При недостаточной длине добавляем пробелы, используя тернарный оператор
        String res = String.format("%d * %d %s=%s %d", multiplier1, multiplier2, (multiplier2 == 10 ? "" : " "), (result > 9 ? "" : " "), result);
        System.out.printf("%s     ", res);
    }
}
