package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();

        iterateAll(array);
        System.out.println();
        iterateSeconElement(array);
        System.out.println();
        iterateReversed(array);
    }

    /**
     * Итерирование всех элементов массива
     *
     * @param array
     */
    public static void iterateAll(int[] array) {

        System.out.println("Цикл do-while:");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);

        System.out.println("\nЦикл while:");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println("\nЦикл for:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nЦикл foreach:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    /**
     * Итерирование каждого второго элемента массива
     *
     * @param array
     */
    public static void iterateSeconElement(int[] array) {
        System.out.println("Цикл do-while:");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);

        System.out.println("\nЦикл while:");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }

        System.out.println("\nЦикл for:");
        for (i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nЦикл foreach:");
        i = 0;
        for (int element : array) {
            if (i % 2 == 0) {
                System.out.print(element + " ");
            }
            i++;
        }
    }

    /**
     * "Итерирование всех элементов массива в обратном порядке
     *
     * @param array
     */
    public static void iterateReversed(int[] array) {
        System.out.println("Цикл do-while:");
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);

        System.out.println("\nЦикл while:");
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }

        System.out.println("\nЦикл for:");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nЦикл foreach://перекладываем в новый массив");
        int[] newArray = new int[array.length];
        int j;
        for (i = array.length - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
            newArray[j] = array[i];
        }
        for (int i1 : newArray) {
            System.out.print(i1 + " ");
        }
    }
}
