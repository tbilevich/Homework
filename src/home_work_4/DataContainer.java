package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T. Данный класс как раз и будет решать задачу поставленную перед нами: хранить неограниченное количество
 * передаваемых объектов обобщённого типа.
 * 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых объектов. Да, именно T[] а не Object[]. Если использовать Object[] то это
 * будет опасно и постоянно придётся делать приведеление типов. Поле обязательно не static и private
 * 3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]). Есть и другие способы, но в рамках обучения они будут сложными и с ними
 * мы разбираться будем слишком сложно.
 * 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
 * 4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
 * 4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
 * 4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null]. Метод add вернёт число -1. -1 будет индикатором того что данный
 * элемент в наш контейнер вставлять нельзя.
 * 4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
 * 4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
 * 4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
 * 4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
 * 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
 * 5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
 * 5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
 * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
 * 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
 * 7.1 Метод возвращает true если у нас получилось удалить данные.
 * 7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 7.2 Метод возвращает false если нет такого индекса.
 * 7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
 * 7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
 * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
 * 8.1 Метод возвращает false если передают null.
 * 8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
 * 8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777, null]
 * 8.2 Метод возвращает true если у нас получилось удалить данные.
 * 8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 8.3 Метод возвращает false если нет такого элемента.
 * 8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 8.4 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
 * 8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
 * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта
 * comparator. Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен быть реализован отдельным классом. Для каждого типа данных и сравнений программист создаёт отдельную
 * реализацию интерфейса Comparator.
 * 9.1 Пример data = [3, 1, 3, 777]. Вызывают sort(....) передавая компаратор чисел. Должно получиться data = [1, 3, 3, 777]
 * 9.2 Пример data = ["i", "hello", "1", "Как домашка"]. Вызывают sort(....) передавая компаратор строк по длинне. Должно получиться data = ["i", "1", "hello", "Как домашка"]
 * 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
 * 10.1 Пример data = [1, 2, 3, 777, 3]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3, 777, 3]
 * 10.2 Пример data = [1, 2, 3, null]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3]
 * 10.3 Пример data = []. Вызывают toString() у созданного DataContainer. Возвращается строка []
 * 11.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container) с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
 * DataContainer используя реализацию сравнения вызываемый у хранимых объектов. Для этого надо сделать дженерик метод.
 * 12.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container, Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию
 * интерфейса Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
 * 13.** Реализовать в DataContainer интерфейс Iterable
 *
 * @param <T> - тип элементов данных
 */
public class DataContainer<T> implements Iterable<T> {
	private T[] data;

	/**
	 * Конструктор инициализирует вновь созданный объект DataContainer
	 *
	 * @param data - массив элементов
	 */
	public DataContainer(T[] data) {
		if (data == null) {
			throw new NullPointerException();
		}
		this.data = data;
	}

	/**
	 * Метод добавления данных во внутреннее поле data
	 *
	 * @param item - элемент, который надо добавить в поле data
	 * @return - возвращает номер позиции в которую были вставлены данные
	 */
	public int add(T item) {
		if (item != null) {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == null) {
					data[i] = item;
					return i;
				}
			}
			data = Arrays.copyOf(data, data.length + 1);
			data[data.length - 1] = item;
			return data.length - 1;
		} else {
			return -1;
		}
	}

	/**
	 * Метод возвращающий элемент поля data по его позиции
	 *
	 * @param index - позиция элемента
	 * @return - возвращает элемент по заданной позиции
	 */
	public T get(int index) {
		if (index < 0 || index > data.length - 1) {
			return null;
		}
		return data[index];
	}

	/**
	 * Метод возвращения массива из поля data
	 *
	 * @return - возвращает массив из поля data
	 */
	public T[] getItems() {
		return data;
	}

	/**
	 * Метод удаления элемента из поля data по индексу
	 *
	 * @param index - индекс удаляемого элемента
	 * @return - <code>true</code>, если получилось удалить элемент, и <code>false</code> в противном случае
	 */
	public boolean delete(int index) {
		if (index < data.length && index > -1) {
			for (int i = index; i < data.length - 1; i++) {
				T temp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = temp;
			}
			data = Arrays.copyOf(data, data.length - 1);
			return true;
		}
		return false;
	}

	/**
	 * Метод удаления элемента из поля data
	 *
	 * @param item - удаляемый элемент
	 * @return - <code>true</code>, если получилось удалить элемент, и <code>false</code> в противном случае или был передан null
	 */
	public boolean delete(T item) {
		if (item == null) {
			return false;
		}
		int i = 0;
		while (i < data.length) {
			if (item.equals(data[i])) {
				return delete(i);
			}
			i++;
		}
		return false;
	}

	/**
	 * Метод сортировки данных
	 *
	 * @param comparator - обеъкт класса-"сравниватель"
	 */
	public void sort(Comparator<T> comparator) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = (data.length - 1); j > i; j--) {
				if (comparator.compare(data[j - 1], data[j]) > 0) {
					T temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
			}
		}
	}


	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("[");
		boolean comma = false;

		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				if (comma) {
					strBuilder.append(", ");
				}
				strBuilder.append(data[i]);
				comma = true;
			}
		}
		strBuilder.append("]");
		return strBuilder.toString();
	}

	/**
	 * Метод сортировки элементов
	 *
	 * @param container - переданный объект типа DataContainer
	 * @param <T>       - тип элементов данных
	 */
	public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
		for (int i = 0; i < container.data.length - 1; i++) {
			for (int j = (container.data.length - 1); j > i; j--) {
				if (container.data[j - 1] == null) {
					continue;
				}
				if (container.data[j] == null || container.data[j - 1].compareTo(container.data[j]) > 0) {
					T temp = container.data[j - 1];
					container.data[j - 1] = container.data[j];
					container.data[j] = temp;
				}
			}
		}
	}

	/**
	 * Метод сортировки элементов
	 *
	 * @param container  - обеъкт класса-"сравниватель"
	 * @param comparator - переданный объект типа DataContainer
	 * @param <T>        - - тип элементов данных
	 */
	public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
		if (container != null && comparator != null) {
			for (int i = 0; i < container.data.length - 1; i++) {
				for (int j = (container.data.length - 1); j > i; j--) {
					if (comparator.compare(container.data[j - 1], container.data[j]) > 0) {
						T temp = container.data[j - 1];
						container.data[j - 1] = container.data[j];
						container.data[j] = temp;
					}
				}
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}

	/**
	 * Класс реализующий интерфейс Iterator
	 */
	private class MyIterator implements Iterator<T> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < data.length;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return data[index++];
		}
	}
}
