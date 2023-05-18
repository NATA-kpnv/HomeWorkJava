package test;
import homeWork2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import homeWork2.sorts.SortsMain;
public class Main1Test {
    @Test
    public void sortNormalArray() {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {6, 5, 4, 3, 2, 1};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void Test1() {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {1, 2, 3, 4, 5, 6};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void Test2() {
        int[] expected = {6, 5, 4, 3, 2, 1};
        int[] actual = {1, 2, 3, 4, 5, 6};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
}
