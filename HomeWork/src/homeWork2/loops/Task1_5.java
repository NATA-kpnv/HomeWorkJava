package homeWork2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        /*Task 1_5_1
        * */
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        int maxDig = findMaxDigit(number);
        System.out.print("Максимальная цифра в числе = " + maxDig);

        /*Task 1_5_2
        * */
        int size = 1000;
        double allowError = 0.00;
        System.out.println("Проверка генератора случайных чисел на выборке размером = " + size + " и c допустимой погрешностью = " + allowError);
        if (checkRandom(size, allowError)) {
            System.out.println("Генератор псевдослучайных чисел работает корректно");
        } else {
            System.out.println("Генератор псевдослучайных чисел не работает корректно");
        }
        /*Task 1_5_3
        * */
        System.out.print("Введите натуральное число для подсчета четных и нечетных цифр: ");
         int prn = scanner.nextInt();
        countEvenOdd(prn);

        /*Task 1_5_4
        * */
        System.out.print("Введите количество чисел ряда Фибоначчи");
        int n = scanner.nextInt();
        String strFibonachi = printFibonachi(n);
        System.out.println( strFibonachi);


        /*Task 1_5_5
        */
        System.out.print("Введите минимум: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимум: ");
        int max = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();
        String strRange = printRange(min, max, step);
        System.out.println(strRange);

        /*Task 1_5_6
         */
        System.out.print("Введите число, для получения перевернутого числа");  // Task 1_5_6
        int numberRev = scanner.nextInt();
        int reversed = reverseNumber(numberRev);
        System.out.println("Перевернутое число: " + reversed);

    }


    /**
     *
     * Метод для поиска в введенном числе максимальной цифры
     * @param number Число для анализа
     * @return Максимальная цифра в введенном числе
     */
    public static int findMaxDigit(int number) {
        if (number <= 0) {
            System.out.print("Число должно быть натуральным");
        }
        int max = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max =digit;
            }
            number /= 10;
        }

        return max;
    }

    /**
     * Проверка на правильность работы генератора случайгых чисел
     *
     * @param size       Размер выборки
     * @param allowError Допустимая погрешность
     * @return
     */
    public static boolean checkRandom(int size, double allowError) {
        if (size <= 0) {
            return false;
        }
        Random random = new Random();
        int countEven = 0;
        for (int i = 0; i < size; i++) {
            int number = random.nextInt();
            if (number % 2 == 0) {
                countEven++;
            }
        }
        double evenProbably = (double) countEven / size;
        double normalProbably = 0.5;
        return Math.abs(evenProbably - normalProbably) < allowError;
    }

    /**
     *
     * @param n количество элементов Фибоначчи
     * @return строка с нужным количеством ряда Фибоначчи
     */
    public static String printFibonachi(int n) {
        int n1 = 0, n2 = 1, n3;
        String str;
        str = n1 + " " + n2 ;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            str = str + " " + n3;
            n1 = n2;
            n2 = n3;
        }
        return str;

    }

    /**
     * Считаем и выводим на экран количество четных и нечетных цифр в числе
     * @param n числоа для анализа
     */
    public static void countEvenOdd(int n) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            int num = n  %10;
            n /= 10;
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
    }

    /**
     * Получаем строку и чисел от min до max с шагом
     * @param min
     * @param max
     * @param step
     * @return
     */
    public static String printRange(int min, int max, int step) {
        String str = "";;
        for (int i = min; i <= max; i += step) {
            str = str + i + " ";
        }
        return str;
    }

    /**
     * Получение перевернутого числа
     * @param n
     * @return
     */
    public static int reverseNumber (int n) {
        int reverse = 0;
        while( n!= 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
        }


}
