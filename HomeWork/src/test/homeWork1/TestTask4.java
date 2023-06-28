package test.homeWork1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import HomwWork1.*;

public class  TestTask4 {
    @Test
    public void  task4_1() {
        int evenNum = 4;
        int oddNum = 7;

        boolean evenResult = Task4_1.isEven(evenNum);
        boolean oddResult = Task4_1.isEven(oddNum);

        Assertions.assertTrue(evenResult);
        Assertions.assertFalse(oddResult);
    }

    @Test
    public void task4_2(){
        int a = 5;
        int b = 10;
        int c = 7;

        int result = Task4_2.findAverage(a, b, c);

        Assertions.assertEquals(7, result);
    }
    @Test
    public void task4_3() {
        int num1 = 15;
        int num2 = 3;

        boolean result = Task4_3.checkDivisibility(num1, num2);

        Assertions.assertTrue(result);
    }

    @Test
    public void task4_4KilobytesToBytes() {
        long kilobytes = 10;
        long expectedBytes = 10240;

        long actualBytes = Task4_4.convertKilobytesToBytes(kilobytes);

        Assertions.assertEquals(expectedBytes, actualBytes);
    }

    @Test
    public void task4_4BytesToKilobytes() {
        long bytes = 2048;
        long expectedKilobytes = 2;

        long actualKilobytes = Task4_4.convertBytesToKilobytes(bytes);

        Assertions.assertEquals(expectedKilobytes, actualKilobytes);
    }

    @Test
    public void task4_5IsLetter() {
        char letter = 'A';
        boolean expected = true;

        boolean actual = Task4_5.isLetter(letter);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void task4_5IsNotLetter() {
        char letter = '1';
        boolean expected = false;

        boolean actual = Task4_5.isLetter(letter);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void task4_6LeapYear() {
        int leapYear = 2020;
        boolean expected = true;

        boolean actual = Task4_6.isLeapYear(leapYear);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task4_6NonLeapYear() {
        int nonLeapYear = 2021;
        boolean expected = false;

        boolean actual = Task4_6.isLeapYear(nonLeapYear);

        Assertions.assertEquals(expected, actual);
    }
}
