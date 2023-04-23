/*
 Середи трёх чисел найти средне
 */
package HomwWork1;

import java.util.Scanner;

public class Task4_2 {
    // Середи трёх чисел найти среднее
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        int average;

        if ((a > b && a < c) || (a > c && a < b)) {
            average = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            average = b;
        } else {
            average = c;
        }

        System.out.println("Среднее число: " + average);
    }
}

