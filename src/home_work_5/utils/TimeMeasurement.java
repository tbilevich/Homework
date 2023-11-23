package home_work_5.utils;

import home_work_5.utils.GenerateCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;

public class TimeMeasurement {
    /**
     * Метод замера времени заполнения коллекции
     *
     * @param supplier   - функциональный интерфейс для создания объекта
     * @param collection - коллекция, время заполнения которой надо определить
     * @param count      - колличество элементов, которые необходимо добавить в коллекцию
     * @param <T>        - тип объекта, которым заполняется коллекция
     * @return - возвращает время заполнения коллекции
     */
    public static <T> String collectionFillingTime(Supplier<T> supplier, Collection<T> collection, int count) {
        long start = System.currentTimeMillis();
        GenerateCollection.generateCollection(supplier, collection, count);
        long end = System.currentTimeMillis();
        return "Время заполнения коллекции " + collection.getClass().getName() + " : " + (end - start);
    }

    /**
     * Метод замера времени итерирования коллекции при помощи Iterator
     *
     * @param collection - коллекция, время итерирования которой надо определить
     * @param <T>        - тип объекта, которым заполнена коллекция
     * @return - возвращает время итерирования коллекции
     */
    public static <T> String collectionIterationTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long end = System.currentTimeMillis();
        return "Время итерирования коллекции при помощи Iterator " + collection.getClass().getName() + " : " + (end - start);
    }

    /**
     * Метод замера времени итерирования коллекции при помощи For
     *
     * @param collection - коллекция, время итерирования которой надо определить
     * @param <T>        - тип объекта, которым заполнена коллекция
     * @return - возвращает время итерирования коллекции
     */
    public static <T> String collectionIterationWithForTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        int count = 0;
        T[] array = (T[]) collection.toArray();
        for (int i = 0; i < collection.size(); i++) {
            T s = array[i];
            count++;
        }
        long end = System.currentTimeMillis();
        return " Время итерирования коллекции при помощи For " + collection.getClass().getName() + " : " + (end - start);
    }

    /**
     * Метод замера времени для удаления элементов коллекции
     *
     * @param collection - коллекция, время удаления элементов которой надо определить
     * @param <T>        - тип объекта, которым заполнена коллекция
     * @return - возвращает время удаления элементов коллекции
     */
    public static <T> String deletingObjectsTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        long end = System.currentTimeMillis();
        return "Время удаления элементов коллекции " + collection.getClass().getName() + " : " + (end - start);
    }
}
