package test.homeWork2;

import homeWork2.loops.AllTask1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestTasks1All {
    @Test
    public void testMultiply() {
        long n = 5;
        long expected = 120;
        long actual = AllTask1.multiply(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial() {
        long n = 5;
        long expected = 120;
        long actual = AllTask1.factorial(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSummAllDigit() {
        long number = 12345;
        String expected = "1 * 2 * 3 * 4 * 5 = 120";
         expected = expected.replaceAll("\\s+", "");
        String actual = AllTask1.summAllDigit(number);
        actual = actual.replaceAll("\\s+", "");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testExponent() {
        double base = 2.0;
        double exponent = 4.0;
        double expected = 16.0;
        double actual = AllTask1.exponent(base, exponent);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCheckOverflow() {
        int multiple = 10;
        long[] expected = {1000000000000000000L, -8446744073709551616L};
        long[] actual = AllTask1.checkOverflow(multiple);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindMaxDigit() {
        int number = 547829;
        int expected = 9;
        int actual = AllTask1.findMaxDigit(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCheckRandom() {
        int size = 1000;
        double allowError = 0.1;
        boolean result = AllTask1.checkRandom(size, allowError);
        Assertions.assertTrue(result);
    }

    @Test
    public void testPrintFibonachi() {
        int n = 10;
        String expected = "0 1 1 2 3 5 8 13 21 34";
        String actual = AllTask1.printFibonachi(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenOdd() {
        int n = 1234567;
        int[] expected = {3, 4};
        int[] actual = AllTask1.countEvenOdd(n);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrintRange() {
        int min = 1;
        int max = 10;
        int step = 2;
        String expected = "1 3 5 7 9 ";
        String actual = AllTask1.printRange(min, max, step);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumber() {
        int n = 12345;
        int expected = 54321;
        int actual = AllTask1.reverseNumber(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBuildRow() {
        int from = 1;
        int to = 5;
        String expected = "1 x 1 = 1\t2 x 1 = 2\t3 x 1 = 3\t4 x 1 = 4\t5 x 1 = 5\t\n" +
                "1 x 2 = 2\t2 x 2 = 4\t3 x 2 = 6\t4 x 2 = 8\t5 x 2 = 10\t\n" +
                "1 x 3 = 3\t2 x 3 = 6\t3 x 3 = 9\t4 x 3 = 12\t5 x 3 = 15\t\n" +
                "1 x 4 = 4\t2 x 4 = 8\t3 x 4 = 12\t4 x 4 = 16\t5 x 4 = 20\t\n" +
                "1 x 5 = 5\t2 x 5 = 10\t3 x 5 = 15\t4 x 5 = 20\t5 x 5 = 25\t\n" +
                "1 x 6 = 6\t2 x 6 = 12\t3 x 6 = 18\t4 x 6 = 24\t5 x 6 = 30\t\n" +
                "1 x 7 = 7\t2 x 7 = 14\t3 x 7 = 21\t4 x 7 = 28\t5 x 7 = 35\t\n" +
                "1 x 8 = 8\t2 x 8 = 16\t3 x 8 = 24\t4 x 8 = 32\t5 x 8 = 40\t\n" +
                "1 x 9 = 9\t2 x 9 = 18\t3 x 9 = 27\t4 x 9 = 36\t5 x 9 = 45\t\n" +
                "1 x 10 = 10\t2 x 10 = 20\t3 x 10 = 30\t4 x 10 = 40\t5 x 10 = 50\t\n";
        String actual = AllTask1.buildRow(from, to);
        Assertions.assertEquals(expected, actual);
    }
}
