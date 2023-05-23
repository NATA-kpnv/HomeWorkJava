/*
Определить нечётное число
 */
package HomwWork1;

import java.util.Scanner;
//Определить нечётное число
public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println(num + " - четное");
        } else {
            System.out.println(num + " - нечетное");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
