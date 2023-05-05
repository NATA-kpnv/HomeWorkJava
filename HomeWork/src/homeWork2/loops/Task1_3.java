package homeWork2.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.print("Введите число для возведения в степень: ");
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        System.out.print("Введите степень: ");
        double exponent = scanner.nextDouble();
        if (exponent <= 0) {
            System.out.println("Ввели отрицательное число. Степень должна быть положительным  и целым числом");
            return;
        } else if(exponent != (int) exponent){
            System.out.println("Ввели дробное число. Степень должна быть положительным целым числом");
            return;
        }
        double result = 1.0;
        for (int i = 0; i < (int) exponent; i++) {
            result = result * base;
        }
        System.out.println(base + "^" + (int) exponent + "=" + result);


    }
}
