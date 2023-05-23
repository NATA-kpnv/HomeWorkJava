package homeWork2.arrays;
import java.util.Arrays;
public interface IArraysOperation {
    /**
     *  Итерирование всех элементов массива
     * @param array
     * @return array
     */
    public int[] iterateAll(int[] array);

    /**
     * Итерирование каждого второго элемента массива
     * @param array
     * @return
     */
    public int[] iterateSeconElement(int[] array);

    /**
     * Итерирование всех элементов массива в обратном порядке
     * @param array
     * @return
     */
    public int[] iterateReversed(int[] array);

    /**
     * Вывод в консоль массива
     * @param array
     */
    public void showArray(int[] array);

}
