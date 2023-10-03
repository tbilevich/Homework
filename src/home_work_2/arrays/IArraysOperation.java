package home_work_2.arrays;

/**
 * Данный интерфейс был создан для работы с массивом
 */
public interface IArraysOperation {

    /**
     * Метод вывода всех элементов массива в консоль
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку элементов массива
     */
    String printElementsOfArray(int[] container);

    /**
     * Метод вывода каждого второго элемента массива
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех вторых элементов массива
     */
    String printEverySecondElem(int[] container);

    /**
     * Метод вывода всех элементов массива в обратном порядке
     *
     * @param container - введенный с консоли массив
     * @return - возвращает строку всех элементов массива в обратном порядке
     */
    String printArrInReverseOrder(int[] container);
}
