package homeWork5;

import java.util.Comparator;

public class ComparatorLength <T extends String> implements Comparator <T> {
    @Override
    public int compare(T o1, T o2) {
       return Integer.compare(o1.length(), o2.length());
    }
}
