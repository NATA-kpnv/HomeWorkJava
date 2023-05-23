/*
 Проверка делимости одного числа на другое
 */
package HomwWork1;

import java.util.Scanner;

public class Task4_3 {
    //Проверка делимости одного числа на другое
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        boolean isDivisible = checkDivisibility(num1, num2);

        if (isDivisible) {
            System.out.println(num1 + " делится на " + num2 + " без остатка");
        } else {
            System.out.println(num1 + " не делится на " + num2 + " без остатка");
        }
    }

    public static boolean checkDivisibility(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
