package homeWork2.arrays;
import java.util.Arrays;
public class DoWhileOperation  implements  IArraysOperation{

    public DoWhileOperation() {
    }

    @Override
    public int[] iterateAll(int[] array) {
        int [] arrayReturn = new int[array.length];
        int i = 0;
        do {
            arrayReturn[i] = array[i];
            i++;
        } while (i < array.length);

        return arrayReturn;
    }

    @Override
    public int[] iterateSeconElement(int[] array) {
        int lengthReturn = (int) Math.floor(array.length / 2.0);
        int [] arrayReturn = new int[lengthReturn];
        int i = 1;
        int j = 0;
        do {
            arrayReturn[j] = array[i];
            i += 2;
            j++;
        } while (i < array.length && j < lengthReturn);
        return arrayReturn;
    }

    @Override
    public int[] iterateReversed(int[] array) {
        int [] arrayReturn = new int[array.length];
        int i = array.length - 1;
        int j = 0;
        do {
            arrayReturn[j] = array[i];
            i--;
            j++;
        } while( i >= 0 && j < array.length );
        return arrayReturn;
    }

    @Override
    public void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
