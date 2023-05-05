package homeWork2.utils;

import java.util.Arrays;

public class ArraysUtilTestRandom {
    public static void main(String[] args) {

        System.out.println("Тестирование рандомными числами");
        int[] container = ArraysUtils.arrayRandom(5, 100);
        System.out.println("container" + Arrays.toString(container));
    }
}
