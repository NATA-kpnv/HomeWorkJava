package homeWork5;

import java.util.*;
import java.util.function.Consumer;

import static java.lang.System.arraycopy;

public class DataContainer<T> implements Iterable<T> {
    public T[] data;

    /** Task3
     *
     * @param data
     */
    public DataContainer(T[] data) {
        this.data = data;
    }
    /** Task4
     *
     * @param item
     * @return
     */
    public int add(T item) {
        int position = -1;
        //Пучтой элемент
        if (item != null) {
            //Поиск пустой ячейки
            int freeIndex = -1;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    freeIndex = i;
                    break;
                }
            }
            if (freeIndex != -1) {
                data[freeIndex] = item;
                position = freeIndex;
            } else {
                //Нет пустой ячейки - расширяем массив
                T[] newData;
                newData = Arrays.copyOf(data, data.length + 1);
                newData[data.length] = item;
                data = newData;
                position = data.length - 1;

            }
        }
        return position;
    }

    /**
     * Task5
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }
        return null;
    }

    /** Task 6 - СДЕЛАТЬ!!!!
     *
     * @return
     */
    public T[] getItems() {
        T[] newData;
        newData = (T[]) new Object[data.length];
        newData = data;
        return newData;
    }

    /**
     * Task 7
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index >= 0 && index < data.length) {
            T[] newData;
            newData = (T[]) new Object[data.length - 1];
            arraycopy(data, 0, newData, 0, index);
            arraycopy(data, index + 1, newData, index, data.length - index - 1);
            data = newData;
            return true;
        }
        return false;

    }

    /**
     * Task 8
     *
     * @param item
     * @return
     */
    public boolean delete(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] != null && data[i].equals(item)) {
                    delete(i);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /** Task 9
     *
     * @param comparator
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length - i-1; j++) {
                if (data[j] == null ) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if ( data[j] != null && data[j+1] != null && comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /** Task10
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                sb.append(data[i]);
                if (i < data.length  - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /** Task11
     *
     * @param container
     * @param <T>
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        T[] data = container.data;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] == null ) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if ( data[j] != null && data[j+1] != null &&data[j].compareTo(data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /** task12
     *
     * @param container
     * @param comparator
     * @param <T>
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] data = container.data;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] == null ) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if ( data[j] != null && data[j+1] != null &&comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        int i = 1;
       return new DataContainerIterator();
    }
    private class DataContainerIterator implements Iterator<T> {
        private int currentIndex;

        public DataContainerIterator() {
            currentIndex = 0;
        }

        public boolean hasNext() {
            return currentIndex < data.length && data[currentIndex] != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[currentIndex++];
        }
    }

}
