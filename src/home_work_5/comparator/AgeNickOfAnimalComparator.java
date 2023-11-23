package home_work_5.comparator;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class AgeNickOfAnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 == null && o2 != null) {
            return -1;
        } else if (o1 != null && o2 == null) {
            return 1;
        } else if (o1 == null && o2 == null) {
            return 0;
        } else {
            return compareAge(o1, o2);
        }
    }

    /**
     * Метод сравнения поля Age у объектов
     *
     * @param o1 - первый объект
     * @param o2 - второй объект
     * @return - возвращает:
     * -1, если Age у объекта o1 < Age у объекта o2;
     *  0, если Age у объекта o1 = Age у объекта o2;
     *  1, если Age у объекта o1 > Age у объекта o2
     */
    public int compareAge(Animal o1, Animal o2) {
        if (o1.getAge() == null && o2.getAge() != null) {
            return -1;
        } else if (o1.getAge() != null && o2.getAge() == null) {
            return 1;
        } else if (o1.getAge() == null && o2.getAge() == null) {
            return compareNick(o1, o2);
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return compareNick(o1, o2);
        }
    }

    /**
     * Метод сравнения поля Nick у объектов (алфавитный порядок)
     *
     * @param o1 - первый объект
     * @param o2 - второй объект
     * @return - возвращает:
     * -1, если Nick у объекта o1, согласно алфавиту, расположен раньше, чем Nick у объекта o2;
     *  0, если Nick у объекта, согласно алфавиту, равен Nick у объекта o2;
     *  1, если Nick у объекта, согласно алфавиту, расположен позже, чем Nick у объекта o2
     */
    public int compareNick(Animal o1, Animal o2) {
        if (o1.getNick() == null && o2.getNick() != null) {
            return -1;
        } else if (o1.getNick() != null && o2.getNick() == null) {
            return 1;
        } else if (o1.getNick() == null && o2.getNick() == null) {
            return 0;
        } else {
            return o1.getNick().compareTo(o2.getNick());
        }
    }
}
