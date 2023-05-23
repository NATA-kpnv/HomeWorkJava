package test.homeWork2;

import homeWork2.arrays.Task2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Test2_4 {

    @Test
    public void testSumEvenPositive() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumEven = Task2_4.sumEvenPositive(arr);
        Assertions.assertEquals(30, sumEven);
    }
    /**
     * Максимальный элемент с четным индексом в массиве
     * */
    @Test
    public void testMaxElEvenIndex() {
        int[] arr = {1, 71, 3, 105, 9, 2, 1501, 120, 4};
        int maxEvInd = Task2_4.maxElEvenIndex(arr);
        Assertions.assertEquals(1501, maxEvInd);
    }

    @Test
    public void testArrayLessAverage() {
        int[] arr = {10, 5, 15, 8, 20, 3, 12};
        int[] arrLessAverage = Task2_4.arrayLessAverage(arr);
        int[] expected = {10, 5, 8, 3};
        Assertions.assertArrayEquals(expected, arrLessAverage);
    }

    @Test
    public void testTwoSmallest() {
        int[] arr = {5, 8, 3, 9, 1, 7};
        int[] arrTwoSmallest = Task2_4.twoSmallest(arr);
        int[] expected = {1, 3};
        Assertions.assertArrayEquals(expected, arrTwoSmallest);
    }

    @Test
    public void testCompress() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int[] arrCompress = Task2_4.compress(arr, 5, 11);
        int[] expected = {2, 4, 12, 14};
        Assertions.assertArrayEquals(expected, arrCompress);
    }

    /**
     * Сумма цифр массива
     */
    @Test
    public void testSumElements() {
        int[] arr = {1, 2, 3, 4, 5, 100 };
        int arrSumElements = Task2_4.sumElements(arr);
        Assertions.assertEquals(16, arrSumElements);
    }
}
