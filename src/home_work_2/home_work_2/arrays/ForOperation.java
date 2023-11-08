package home_work_2.arrays;

/**
 * Реализация интерфейса IArraysOperation, используя в методах цикл for
 */
public class ForOperation implements IArraysOperation {

    /**
     * Метод вывода всех элементов массива в консоль
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку элементов массива
     */
    @Override
    public String printElementsOfArray(int[] container) {

        // Проверка длины массива
        if (container.length == 0) {
            return "The array is empty!";
        }
        String str = "";
        int i;

        // Формирование строки элементов массива при помощи цикла for
        for (i = 0; i < container.length; i++) {
            int element = container[i];
            str += element + " ";
        }
        return str;
    }

    /**
     * Метод вывода каждого второго элемента массива
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех вторых элементов массива
     */
    @Override
    public String printEverySecondElem(int[] container) {

        // Проверка длины массива
        if (container.length < 2) {
            return "It is impossible to output the second element of the array when the array length is < 2";
        }
        String str = "";
        int i;

        // Формирование строки всех вторых элементов массива при помощи цикла for
        for (i = 1; i < container.length; i += 2) {
            str += container[i] + " ";
        }
        return str;
    }

    /**
     * Метод вывода всех элементов массива в обратном порядке
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех элементов массива в обратном порядке
     */
    @Override
    public String printArrInReverseOrder(int[] container) {

        // Проверка длины массива
        if (container.length == 0) {
            return "The array is empty!";
        }
        String str = "";
        int i;

        // Формирование строки всех элементов массива в обратном порядке при помощи цикла for
        for (i = container.length - 1; i >= 0; i--) {
            str += container[i] + " ";
        }
        return str;
    }
}
