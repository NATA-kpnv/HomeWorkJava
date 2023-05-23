package test.homeWork1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import HomwWork1.*;
public class TestTask5 {
    @Test
    public void task5SleepInWeekday() {
        boolean weekday = true;
        boolean vacation = false;
        boolean expected = false;

        boolean actual = Task5.sleepIn(weekday, vacation);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void task5SleepInVacation() {
        boolean weekday = false;
        boolean vacation = true;
        boolean expected = true;

        boolean actual = Task5.sleepIn(weekday, vacation);

        Assertions.assertEquals(expected, actual);
    }
}
