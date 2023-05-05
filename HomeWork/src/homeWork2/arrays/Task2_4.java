package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = ArraysUtils.arrayRandom(50, 100);
        System.out.println(Arrays.toString(arr));


        int sumEven = sumEvenPositive(arr);
        System.out.println(" Сумма всех четных положительных элементов в массиве  = " + sumEven);

        int maxEvInd = maxElEvenIndex(arr);
        System.out.println("Максимальный элемент с четным индексом в массиве = " + maxEvInd);

        System.out.println("Элементы массива, которые меньше среднего арифметического");
        int[] arrLessAverage = arrayLessAverage(arr);
        System.out.println(Arrays.toString(arrLessAverage));

        System.out.println("\nДва наименьших (минимальных) элемента массива");
        int[] arrTwoSmallest = twoSmallest(arr);
        System.out.println(Arrays.toString(arrTwoSmallest));

        System.out.println("\nСжать массив, удалив элементы, принадлежащие интервалу");
        System.out.print("Введите начало интервала: ");
        int from = scanner.nextInt();
        System.out.print("Введите конец интервала: ");
        int to = scanner.nextInt();
        int[] arrCompress = compress(arr, from, to);
        System.out.println("Сжатый массив =  " + Arrays.toString(arrCompress));


        int arrSumElements = sumElements(arr);
        System.out.println("\nСумма цифр массива = " + arrSumElements);
    }

    /**
     * Вычеслить сумму четных положительных элементов
     *
     * @param arr
     * @return
     */
    public static int sumEvenPositive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Максимальный элемент с четным индексом в массиве
     *
     * @param arr
     * @return
     */
    public static int maxElEvenIndex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Элементы массива, которые меньше среднего арифметического
     *
     * @param arr
     * @return
     */
    public static int[] arrayLessAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static int[] twoSmallest(int[] arr) {
        int min1 = arr[0];
        int min2 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        return new int[]{min1, min2};
    }

    /**
     * Сумма цифр массива
     *
     * @param arr
     * @return
     */
    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }

    /**
     * Сжать массив, удалив элементы, принадлежащие интервалу
     *
     * @param arr  массив
     * @param from начало интервала
     * @param to   конец интервала
     * @return
     */
    public static int[] compress(int[] arr, int from, int to) {

        if (from >= to || from < 0 || to > 1000000) {
            System.out.println("Некорректный интервал.");
            int[] errArray = new int[0];
            return errArray;
        }
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < from || arr[i] > to) {
                newSize++;
            }
        }
        int[] newArr = new int[newSize];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < from || arr[i] > to) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}
