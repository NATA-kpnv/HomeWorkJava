package homeWork2.utils;

import java.util.Scanner;
import java.util.Random;
public class ArraysUtils {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    /**
     * Запрашивает размер массива и его элементы у пользователя через консоль.
     * @return массив с элементами, введенными пользователем.
     */
    public static int[] arrayFromConsole() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     * Генерирует массив заданного размера со случайными значениями до хаданного максимального значения.
     * @param size размер массива
     * @param max максимальное значение
     * @return  массив со случайными значениями
     */
    public static int[] arrayRandom(int size, int max){
        int[] array = new int[size];
        for(int i = 0; i< size; i++){
            array[i] = random.nextInt(max);
        }
        return array;
    }
}
