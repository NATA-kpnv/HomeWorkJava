package homeWork5;
import java.util.Comparator;
public class ComparatorGeneral <T> implements Comparator <T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1 instanceof String && o2 instanceof String) {
            String str1 = o1.toString();
            String str2 = o2.toString();
            return Integer.compare(str1.length(), str2.length());
        } else if (o1 instanceof Number && o2 instanceof Number) {
            Comparable<T> num1 = (Comparable<T>) o1;
            return num1.compareTo(o2);
        }
        return 0;
    }
}
