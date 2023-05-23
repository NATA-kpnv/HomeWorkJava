package test.homeWork2;
import homeWork2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestIterateArray {
    final int[] intArray = {1,99,98,4,36,7,5};
    final int[] expected1 = {1,99,98,4,36,7,5};
    final int[] expected2 = {99,4,7};

    final int[] expected3 = {5,7,36,4,98,99,1};

    @Test
    public void iterateAllDoWhileOperation(){
        int [] result;
        IArraysOperation iterator = new DoWhileOperation();
        result = iterator.iterateAll(intArray);
        Assertions.assertArrayEquals(expected1, result);
    }
    @Test
    public void iterateSeconElementDoWhileOperation(){
        int [] result;
        IArraysOperation iterator = new DoWhileOperation();
        result = iterator.iterateSeconElement(intArray);
        Assertions.assertArrayEquals(expected2, result);
    }

    @Test
    public void iterateReversedDoWhileOperation(){
        int [] result;
        IArraysOperation iterator = new DoWhileOperation();
        result = iterator.iterateReversed(intArray);
        Assertions.assertArrayEquals(expected3, result);
    }


    @Test
    public void iterateAllWhileOperation(){
        int [] result;
        IArraysOperation iterator = new WhileOperation();
        result = iterator.iterateAll(intArray);
        Assertions.assertArrayEquals(expected1, result);
    }
    @Test
    public void iterateSeconElementWhileOperation(){
        int [] result;
        IArraysOperation iterator = new WhileOperation();
        result = iterator.iterateSeconElement(intArray);
        Assertions.assertArrayEquals(expected2, result);
    }

    @Test
    public void iterateReversedWhileOperation(){
        int [] result;
        IArraysOperation iterator = new WhileOperation();
        result = iterator.iterateReversed(intArray);
        Assertions.assertArrayEquals(expected3, result);
    }
    @Test
    public void iterateAllForEachOperation(){
        int [] result;
        IArraysOperation iterator = new ForEachOperation();
        result = iterator.iterateAll(intArray);
        Assertions.assertArrayEquals(expected1, result);
    }

    @Test
    public void iterateSeconElementForEachOperation(){
        int [] result;
        IArraysOperation iterator = new ForEachOperation();
        result = iterator.iterateSeconElement(intArray);
        Assertions.assertArrayEquals(expected2, result);
    }

    @Test
    public void iterateReversedForEachOperation(){
        int [] result;
        IArraysOperation iterator = new ForEachOperation();
        result = iterator.iterateReversed(intArray);
        Assertions.assertArrayEquals(expected3, result);
    }
    @Test
    public void iterateAllForOperation(){
        int [] result;
        IArraysOperation iterator = new ForOperation();
        result = iterator.iterateAll(intArray);
        Assertions.assertArrayEquals(expected1, result);
    }
    @Test
    public void iterateSeconElementForOperation(){
        int [] result;
        IArraysOperation iterator = new ForOperation();
        result = iterator.iterateSeconElement(intArray);
        Assertions.assertArrayEquals(expected2, result);
    }

    @Test
    public void iterateReversedForOperation(){
        int [] result;
        IArraysOperation iterator = new ForOperation();
        result = iterator.iterateReversed(intArray);
        Assertions.assertArrayEquals(expected3, result);
    }

}
