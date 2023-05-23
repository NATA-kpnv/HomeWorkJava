package test.homeWork1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import HomwWork1.*;
public class TestTask7 {
    @Test
    public void testCreatePhoneNumber() {
        int[] phoneArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        String actual = Task7.createPhoneNumber(phoneArray);
        Assertions.assertEquals(expected, actual);
    }
}
