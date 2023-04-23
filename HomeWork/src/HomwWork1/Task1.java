/*
 * Класс для выполнения побитовых операций
 * Примеры:
 * Побитовая операция & - AND:
 *  00000101 (5)
 * &00000011 (3)
 * --------
 *  00000001 (1)
 *
 * Побитовая операция / - OR:
 *  00000101 (5)
 * /00000011 (3)
 * ---------
 *  00000111 (7)
 */


package HomwWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число"); // 5 = 0b 00000101
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число"); // 3 = 0b 00000011
        int num2 = scanner.nextInt();

        //Побитовая операция & - AND:
        int resultBitwiseAnd = num1 & num2;   // Exmpl: 00000101 (5) & 00000011 (3) = 00000001 (1)
        System.out.println("Результат побитовой операции И (AND): " + resultBitwiseAnd);

        //Побитовая операция / - OR:
        int resultBitwiseOr = num1 | num2;  // Exmpl: 00000101 (5) / 00000011 (3) =  00000111 (7)
        System.out.println("Результат побитовой операции ИЛИ (OR): " + resultBitwiseOr);

    }
}
