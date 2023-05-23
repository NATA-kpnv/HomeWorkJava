package homeWork2.loops;

import java.util.Random;
import java.util.Scanner;

public class AllTask1 {
    /**
     * Перемножить числа 1-1-1
     *
     * @param n
     * @return
     */
    public static long multiply(long n) {
        long result = 1;

        for (long i = 1; i <= n; i++) {
            if (result > Long.MAX_VALUE / i) {
//                    System.out.println("Переполнение!");
//                    System.out.println("Последний допустимый резул2ьта" + result);
                return result;
            }
            result *= i;
        }
        return result;
    }

    /**
     * Перемножить числа 1-1-2 использую рекурсию
     *
     * @param n
     * @return
     */
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        long result = n * factorial(n - 1);
        return result;
    }

    /**
     * Сумма цифр в числе 1-2
     *
     * @param number
     * @return
     */
    public static String summAllDigit(long number) {
        long input = number;
        // Разбиваем число на отдельные цифры и перемножаем их
        long result = 1;
        String output = "";
        long oneNumb;
        while (number != 0) {
            oneNumb = number % 10;
            output = "*" + oneNumb + output;
            number /= 10;
            result = oneNumb * result;
        }
        output = output.substring(1); // удаляем первый символ "*"
        output = output + " = " + result;
        return output;
    }

    /**
     * Возведение в степень  1-3
     *
     * @param base
     * @param exponent
     * @return
     */
    public static double exponent(double base, double exponent) {
        double result = 1.0;
        if (exponent <= 0) {
            // System.out.println("Ввели отрицательное число. Степень должна быть положительным  и целым числом");
            //  return;
        } else if (exponent != (int) exponent) {
            // System.out.println("Ввели дробное число. Степень должна быть положительным целым числом");
            //  return;
        }
        for (int i = 0; i < (int) exponent; i++) {
            result = result * base;
        }
        return result;
    }

    /**
     * Переполнение 1-4
     * @param multiple
     * @return [1] - до переполнения,  [2] - после переполнения
     */
    public static long[] checkOverflow(int multiple) {
        long result = (long) multiple;
        long oldValue = result;

        while (Math.abs(result) <= Long.MAX_VALUE / multiple) {
            oldValue = Math.abs(result);
            result *= multiple;
        }
        oldValue  = result;
        result *= multiple;
        long[] resultArr = {oldValue, result};
        return resultArr;
    }

    /**
     * Метод для поиска в введенном числе максимальной цифры 1-5-1
     *
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
                max = digit;
            }
            number /= 10;
        }

        return max;
    }

    /**
     * Проверка на правильность работы генератора случайгых чисел 1-5-2
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
     * @param n количество элементов Фибоначчи 1-5-4
     * @return строка с нужным количеством ряда Фибоначчи
     */
    public static String printFibonachi(int n) {
        int n1 = 0, n2 = 1, n3;
        String str;
        str = n1 + " " + n2;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            str = str + " " + n3;
            n1 = n2;
            n2 = n3;
        }
        return str;
    }


    /**
     * Считаем и выводим на экран количество четных и нечетных цифр в числе 1-5-3
     *
     * @param n ислоа для анализа
     * @return [1] - четный, [2]- нечетные 1-5-3
     */
    public static int[] countEvenOdd(int n) {
        int evenCount = 0;
        int oddCount = 0;
        while (n != 0) {
            int num = n % 10;
            n /= 10;
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] result = {evenCount, oddCount};
        return result;
    }

    /**
     * Получаем строку и чисел от min до max с шагом 1-5-5
     *
     * @param min
     * @param max
     * @param step
     * @return
     */
    public static String printRange(int min, int max, int step) {
        String str = "";
        ;
        for (int i = min; i <= max; i += step) {
            str = str + i + " ";
        }
        return str;
    }

    /**
     * Получение перевернутого числа  1-5-6
     *
     * @param n
     * @return
     */
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }


    /**
     * Сбор строки с указанными столбцами
     *
     * @param from столбец с которого начинается строка
     * @param to   столбец которым заканчивается строка
     * @return строка с результатом умножения
     */
    public static String buildRow(int from, int to) {
        StringBuilder rowBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                rowBuilder.append(j).append(" x ").append(i).append(" = ").append(j * i).append("\t");
            }
            rowBuilder.append("\n");
        }
        return rowBuilder.toString();
    }


}
