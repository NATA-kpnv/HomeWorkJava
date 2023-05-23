/*
Буква или иной символ
 */
package HomwWork1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву или символ");
        char ch = scanner.next().charAt(0);

        if (isLetter(ch)) {
            System.out.println("Введенный символ является буквой.");
        } else {
            System.out.println("Введенный символ не является буквой.");
        }
    }

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }
}
