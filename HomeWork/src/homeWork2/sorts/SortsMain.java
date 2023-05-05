package homeWork2.sorts;
import homeWork2.utils.ArraysUtils;
import homeWork2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int [] arr1Shake = arr1;
        testSort(arr1);
        testShake(arr1Shake);

        int[] arr2 = new int[]{1, 1, 1, 1};
        int [] arr2Shake = arr2;
        testSort(arr2);
        testShake(arr2Shake);

        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        int [] arr3Shake = arr3;
        testSort(arr3);
        testShake(arr3Shake);

        int[] arr4 = new int[]{};
        int [] arr4Shake = arr4;
        testSort(arr4);
        testShake(arr4Shake);

        int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};
        int [] arr5Shake = arr4;
        testSort(arr5);
        testShake(arr5Shake);

        int[] arrRandom = ArraysUtils.arrayRandom(5, 100);
        int [] arrRandomShake = arrRandom;
        testSort(arrRandom);
        testShake(arrRandomShake);

        int[] arrConsole = ArraysUtils.arrayFromConsole();
        int [] arrConsoleShake = arrConsole;
        testSort(arrConsole);
        testShake(arrConsoleShake);
    }


    public static void testSort(int[] arr) {
        System.out.println("Before sort: " + Arrays.toString(arr));
        SortsUtils.sort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    public static void testShake(int[] arr) {
        System.out.println("Before shake: " + Arrays.toString(arr));
        SortsUtils.shake(arr);
        System.out.println("After shake: " + Arrays.toString(arr));
    }
}
