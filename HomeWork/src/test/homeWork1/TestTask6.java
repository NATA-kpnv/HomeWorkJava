package test.homeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import HomwWork1.task6_new.*;
public class TestTask6 {
    private final ICommunicationPrinter printer1 = new Task6_1();
    private final ICommunicationPrinter printer2 = new Task6_2();
    private final ICommunicationPrinter printer3 = new Task6_3();

    @Test
    public void testWelcome1Vasya() {
        String name = "Вася";
        String expected = "Привет! \t Я тебя так долго ждал";
        String actual = printer1.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome1Anastasia() {
        String name = "Анастасия";
        String expected = "Я тебя так долго ждал";
        String actual = printer1.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome1Other() {
        String name = "111";
        String expected = "Добрый день, а вы кто?";
        String actual = printer1.welcom(name);
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testWelcome2Vasya() {
        String name = "Вася";
        String expected = "Привет! \t Я тебя так долго ждал";
        String actual = printer2.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome2Anastasia() {
        String name = "Анастасия";
        String expected = "Я тебя так долго ждал";
        String actual = printer2.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome2Other() {
        String name = "111";
        String expected = "Добрый день, а вы кто?";
        String actual = printer2.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome3Vasya() {
        String name = "Вася";
        String expected = "Привет! \t Я тебя так долго ждал";
        String actual = printer3.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome3Anastasia() {
        String name = "Анастасия";
        String expected = "Я тебя так долго ждал";
        String actual = printer3.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWelcome3Other() {
        String name = "111";
        String expected = "Добрый день, а вы кто?";
        String actual = printer3.welcom(name);
        Assertions.assertEquals(expected, actual);
    }
}
