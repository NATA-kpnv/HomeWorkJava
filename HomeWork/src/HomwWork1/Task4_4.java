/*
Перевести байты в килобайты или наоборот
 */
package HomwWork1;

import java.util.Scanner;

public class Task4_4 {

    //Перевести байты в килобайты или наоборот
    public static void main(String[] args) {
        long kilobytes;
        long bytes;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Если перевести байты в килобайты введите 1, если наоборот введите любой другой символ");
        int choice = scanner.nextInt();

        if (choice != 1){
            System.out.print("Введите килобайты");
            kilobytes = scanner.nextLong();
            bytes = kilobytes * 1024;
        }
        else {
            System.out.print("Введите байты");
            bytes = scanner.nextLong();
            kilobytes = bytes / 1024;
        }
        System.out.println( bytes + " байт = " + kilobytes + " килобайт ");
    }
}
