package home_work_5.comparator;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class PasswordNickComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null && o2 != null) {
            return -1;
        } else if (o1 != null && o2 == null) {
            return 1;
        } else if (o1 == null && o2 == null) {
            return 0;
        } else {
            return comparePassword(o1, o2);
        }
    }

    /**
     * Метод сравнения поля Password у объектов
     *
     * @param o1 - первый объект
     * @param o2 - второй объект
     * @return - возвращает:
     * -1, если Password у объекта o1 расположен раньше, согласно алфавитно-цифровому порядку, чем Password у объекта o2;
     * 0, если Password у объекта o1 равен, согласно алфавитно-цифровому порядку, Password у объекта o2;
     * 1, если Password у объекта o1 расположен позже, согласно алфавитно-цифровому порядку, чем Password у объекта o2
     */
    public int comparePassword(Person o1, Person o2) {
        if (o1.getPassword() == null && o2.getPassword() != null) {
            return -1;
        } else if (o1.getPassword() != null && o2.getPassword() == null) {
            return 1;
        } else if (o1.getPassword() == null && o2.getPassword() == null) {
            return compareNick(o1, o2);
        } else if (o1.getPassword().length() < o2.getPassword().length()) {
            return -1;
        } else if (o1.getPassword().length() > o2.getPassword().length()) {
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
     * 0, если Nick у объекта, согласно алфавиту, равен Nick у объекта o2;
     * 1, если Nick у объекта, согласно алфавиту, расположен позже, чем Nick у объекта o2
     */
    public int compareNick(Person o1, Person o2) {
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
