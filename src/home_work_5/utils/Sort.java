package home_work_5.utils;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Sort {
    /**
     * Метод сортировки коллекции
     *
     * @param collection - коллекция, которую необходимо отсортировать
     * @param copmarator - класс описывающий правила сортировки
     * @param <T>        - тип объекта
     */
    public static <T> void sort(Collection<T> collection, Comparator<T> copmarator) {
        if (!(collection instanceof List<T>)) {
            throw new RuntimeException("Can't sort not List collection.");
        }

        List<T> tempArray = (List<T>) collection;
        for (int i = 0; i < tempArray.size() - 1; i++) {
            for (int j = (tempArray.size() - 1); j > i; j--) {
                if (copmarator.compare(tempArray.get(j - 1), tempArray.get(j)) > 0) {
                    T temp = tempArray.get(j - 1);
                    tempArray.set(j - 1, tempArray.get(j));
                    tempArray.set(j, temp);
                }
            }
        }
    }
}
