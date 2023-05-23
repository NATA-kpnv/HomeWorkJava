/*
Определить високосный год или нет
 */
package HomwWork1;

import java.util.Scanner;

public class Task4_6 {
    //Определить високосный год или нет
    public static void main(String[] args) {
        boolean year_366;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        Boolean year_366 = false;
        if (year % 400 == 0 && year % 100 != 0) {
            year_366 = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            year_366 = true;
        } else {
            year_366 = false;
        }
        return year_366;
    }
}
