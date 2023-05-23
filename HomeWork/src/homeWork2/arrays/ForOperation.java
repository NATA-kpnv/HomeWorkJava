package homeWork2.arrays;
import java.util.Arrays;
public class ForOperation implements  IArraysOperation{
    @Override
    public int[] iterateAll(int[] array) {
        int [] arrayReturn = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReturn[i] = array[i];
        }
        return arrayReturn;
    }
    @Override
    public int[] iterateSeconElement(int[] array) {
        int lengthReturn = (int) Math.floor(array.length / 2.0);
        int [] arrayReturn = new int[lengthReturn];

        for ( int i = 1, j=0 ; i < array.length && j< lengthReturn; i += 2, j++) {
            arrayReturn[j] = array[i];
        }
        return arrayReturn;
    }

    @Override
    public int[] iterateReversed(int[] array) {
        int [] arrayReturn = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReturn[array.length - 1 - i] = array[i];
        }
        return arrayReturn;
    }


    @Override
    public void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
