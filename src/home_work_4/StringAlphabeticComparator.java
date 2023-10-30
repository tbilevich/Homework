package home_work_4;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null && o2 != null) {
            return -1;
        } else if (o1 != null && o2 == null) {
            return 1;
        } else if (o1 == null && o2 == null) {
            return 0;
        } else {
            return o1.compareTo(o2);
        }
    }
}
