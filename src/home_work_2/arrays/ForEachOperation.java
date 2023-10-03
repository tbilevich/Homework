package home_work_2.arrays;

/**
 * Реализация интерфейса IArraysOperation, используя в методах цикл foreach
 */
public class ForEachOperation implements IArraysOperation {
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

        // Формирование строки элементов массива при помощи цикла foreach
        for (int element : container) {
            str += element + " ";
        }
        str += "  ";

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
        int i = 0;

        // Формирование строки всех вторых элементов массива при помощи цикла foreach
        for (int element : container) {
            if (i % 2 == 1) {
                str += element + " ";
            }
            i++;
        }
        str += "  ";
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
        String[] reversedArray = new String[container.length];
        int j = container.length - 1;
        // Формирование массива всех элементов введенного массива в обратном порядке при помощи цикла foreach
        for (int element : container) {
            reversedArray[j] = element + "";
            j--;
        }
        str += String.join(" ", reversedArray) + "  "; // Формирование строки полученного при помощи цикла foreach массива

        return str;
    }
}
