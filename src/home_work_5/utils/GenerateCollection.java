package home_work_5.utils;

import java.util.Collection;
import java.util.function.Supplier;

public class GenerateCollection {

    /**
     * Метод генерации коллекции
     *
     * @param supplier   - функциональный интерфейс для создания объекта
     * @param collection - коллекция, в которую надо записать созданный объект
     * @param count      - колличество элементов, которые необходимо добавить в коллекцию
     * @param <T>        - тип объекта, который необходимо создать
     * @return - возвращает заполненную коллекцию
     */
    public static <T> Collection<T> generateCollection(Supplier<T> supplier, Collection<T> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(supplier.get());
        }
        return collection;
    }
}
