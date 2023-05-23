package test.homeWork2;

import homeWork2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestSorts {
    @Test
    public void testArr1Sort(){
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {1, 2, 3, 4, 5, 6};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testArr2Sort(){
        int[] expected ={1, 1, 1, 1};
        int[] actual = {1, 1, 1, 1};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testArr3Sort(){
        int[] expected =   {9, 1, 5, 99, 9, 9};
        int[] actual =  {1,5,9,9,9,99};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testArr4Sort(){
        int[] expected =  {1, 1, 1, 1};
        int[] actual =  {1, 1, 1, 1};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testArr5Sort(){
        int[] expected =  {6, 5, 4, 3, 2, 1};
        int[] actual =  {1,2,3,4,5,6};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testArrMySort(){
        int[] expected =  {1,99,98,4,36,7,5};
        int[] actual =  {1,4,5,7,36,98,99};
        SortsUtils.sort(expected);
        Assertions.assertArrayEquals(expected,actual);
    }
}
