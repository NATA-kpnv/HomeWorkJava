package homeWork5;

import java.util.Arrays;
import java.util.Iterator;

import static homeWork5.DataContainer.sort;

public class Test {
    public static String[] testdata = new String[1];
    public static void main(String[] args) {
        testAdd();
        testGet();
         testGetItems();
          testDeleteByIndex();
          testDeleteByItem();
         testSort();
         testToString();
        testSortGeneric();
        testSortGenericComparator();
        testIterator();
    }

    public static void testAdd() {
        Integer[] dataInt = {1, 2, 3, null, null, null};
        DataContainer<Integer> containerInt = new DataContainer<>(dataInt );
        int index1Int = containerInt.add(777);
        System.out.println("Before" + Arrays.toString(containerInt.getItems()));
        System.out.println("index1Int: " + index1Int);
        System.out.println("After add: " + Arrays.toString(containerInt.getItems()));

        DataContainer<String> container = new DataContainer<>(testdata);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        System.out.println("Index1: " + index1);
        System.out.println("Index2: " + index2);
        System.out.println("Index3: " + index3);
        System.out.println("Index4: " + index4);
        System.out.println("After add: " + Arrays.toString(container.getItems()));
    }

    public static void testGet() {
        testdata[0] = null;
        DataContainer<String> container = new DataContainer<>(testdata);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(5);

        System.out.println("Text1: " + text1);
        System.out.println("Text2: " + text2);
        System.out.println("Text3: " + text3);
        System.out.println("Text4: " + text4);
    }

    public static void testGetItems() {
        testdata[0] = null;
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");

        String[] items = container.getItems();

        System.out.println("Items: " + Arrays.toString(items));
    }

    public static void testDeleteByIndex() {
        testdata[0] = null;
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        System.out.println("Before" + Arrays.toString(container.getItems()));
        boolean deleted = container.delete(1);
        System.out.println("Deleted: " + deleted);
        System.out.println("After deleteByIndex: " + Arrays.toString(container.getItems()));

        boolean deleted10 = container.delete(10);
        System.out.println("Deleted: " + deleted10);
        System.out.println("After deleteByIndex: " + Arrays.toString(container.getItems()));
    }

    public static void testDeleteByItem() {
        testdata[0] = null;
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет");
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");

        System.out.println("BeforetestDeleteByItem" + Arrays.toString(container.getItems()));
        boolean deleted = container.delete("Как дела");
        System.out.println("Deleted: " + deleted);
        System.out.println("After deleteByItem: " + Arrays.toString(container.getItems()));

        boolean deleted2 = container.delete("Как дела2");
        System.out.println("Deleted: " + deleted2);
        System.out.println("After deleteByItem: " + Arrays.toString(container.getItems()));
    }

    public static void testSort() {
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет12345678912");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        System.out.println("Before testSort" + Arrays.toString(container.getItems()));
        container.sort(new ComparatorLength<String>());
        System.out.println("After testSort"+ Arrays.toString(container.getItems()));


        Integer[] dataInt = {1, 6, 3, null, 8,null, 55};
        DataContainer<Integer> containerInt = new DataContainer<>(dataInt );
        System.out.println("Before testSort" + Arrays.toString(containerInt.getItems()));
        containerInt.sort(new ComparatorInteger<Integer>());
        //containerInt.sort(new ComparatorLength<>());
        System.out.println("After testSort" + Arrays.toString(containerInt.getItems()));
    }

    public static void testToString() {
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        System.out.println("testToString");
        System.out.println(container.toString());

        Integer[] dataInt = {1, 6, 3, null, 8,null, 55};
        DataContainer<Integer> containerInt = new DataContainer<>(dataInt );
        System.out.println(containerInt.toString());
    }

    public static void testSortGeneric() {
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет12345678912");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");

        System.out.println("Before testSortGeneric" + Arrays.toString(container.getItems()));
        sort(container);
        System.out.println("After testSortGeneric" + Arrays.toString(container.getItems()));


        Integer[] dataInt = {5, 2,null,  8, 1, 3, null};
        DataContainer<Integer> containerInt = new DataContainer<>(dataInt);
        System.out.println("Before testSortGeneric" + Arrays.toString(containerInt.getItems()));

        sort(containerInt);
        System.out.println("After testSortGeneric" + Arrays.toString(containerInt.getItems()));
    }

    public static void testSortGenericComparator() {
        DataContainer<String> container1 = new DataContainer<>(testdata);
        container1.add("Привет12345678912");
        container1.add("Как дела");
        container1.add("Работаю");
        container1.add("Давай потом");
        System.out.println("Before testSortGenericComparator" + Arrays.toString(container1.getItems()));
        DataContainer.sort(container1, new ComparatorLength<String>());
        System.out.println("After testSortGenericComparator" + Arrays.toString(container1.getItems()));

        Integer[] data2 = {5, 2, null, 8, 1, 3, null};
        DataContainer<Integer> container2 = new DataContainer<>(data2);
        System.out.println("Before testSortGenericComparator" + Arrays.toString(container2.getItems()));
        DataContainer.sort(container2, new ComparatorInteger<Integer>());
        System.out.println("After testSortGenericComparator" + Arrays.toString(container2.getItems()));
    }

    public static void testIterator() {
        DataContainer<String> container = new DataContainer<>(testdata);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");
        System.out.println("Before testIterator()" + Arrays.toString(container.getItems()));
        // Получаем итератор
        Iterator<String> iterator = container.iterator();

        // Используем итератор для обхода элементов
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

}
