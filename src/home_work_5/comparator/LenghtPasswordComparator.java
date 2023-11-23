package home_work_5.comparator;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class LenghtPasswordComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null && o2 != null) {
            return -1;
        } else if (o1 != null && o2 == null) {
            return 1;
        } else if (o1 == null && o2 == null) {
            return 0;
        } else {
            return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
        }
    }
}
