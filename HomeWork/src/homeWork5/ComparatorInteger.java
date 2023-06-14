package homeWork5;

import java.util.Comparator;

public class ComparatorInteger<T extends Integer> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1, o2);
    }
}
