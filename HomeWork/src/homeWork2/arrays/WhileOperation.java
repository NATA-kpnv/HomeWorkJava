package homeWork2.arrays;

import java.util.Arrays;

public class WhileOperation implements  IArraysOperation{
    @Override
    public int[] iterateAll(int[] array) {
        int [] arrayReturn = new int[array.length];
        int i = 0;
        while (i < array.length) {
            arrayReturn[i] = array[i];
            i++;
        }
        return arrayReturn;
    }

    @Override
    public int[] iterateSeconElement(int[] array) {
        int lengthReturn = (int) Math.floor(array.length / 2.0);
        int [] arrayReturn = new int[lengthReturn];
        int i = 1;
        int j = 0;
        while (i < array.length && j < lengthReturn ) {
            arrayReturn[j] = array[i];
            i += 2;
            j++;
        }
        return arrayReturn;
    }

    @Override
    public int[] iterateReversed(int[] array) {
        int [] arrayReturn = new int[array.length];
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j < array.length) {
            arrayReturn[j] = array[i];
            i--;
            j++;
        }
        return arrayReturn;
    }

    @Override
    public void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
