package homeWork2.utils;

import java.util.Arrays;

public class ArraysUtilTestConsole {
    public static void main(String[] args) {
        System.out.println("Тестирование через ввд в консоль");
        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println("container" + Arrays.toString(container));
    }
}
