package homeWork2.arrays;

import java.util.Arrays;

public class ForEachOperation implements  IArraysOperation{
    @Override
    public int[] iterateAll(int[] array) {
        int [] arrayReturn = new int[array.length];
        int i = 0;
        for (int element : array) {
            arrayReturn[i] = element;
            i++;
        }
        return arrayReturn;
    }

    @Override
    public int[] iterateSeconElement(int[] array) {
        int lengthReturn = (int) Math.floor(array.length / 2.0);
        int[] arrayReturn = new int[lengthReturn];
        int index = 0;

        for (int i = 1; i < array.length; i += 2) {
            arrayReturn[index] = array[i];
            index++;
        }

        return arrayReturn;
    }

    @Override
    public int[] iterateReversed(int[] array) {
        int [] arrayReturn = new int[array.length];
        int index = 0;
        for (int element : array) {
            arrayReturn[array.length - 1 - index] = element;
            index++;
        }
        return arrayReturn;
    }

    @Override
    public void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
