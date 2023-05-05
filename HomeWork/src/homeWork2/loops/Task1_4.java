package homeWork2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Умножать число long a = 1 на 3  пока не произойдёт переполнение.");
        checkOverflow(1, 3);
        System.out.println("Умножать число long a = 1 на 188  пока не произойдёт переполнение.");
        checkOverflow(1, 188);
        System.out.println("Умножать число long a = 1 на -19 пока не произойдёт переполнение.");
        checkOverflow(1, -19);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите натуральное число = первый множитель");
//        long number1 = scanner.nextLong();
//        System.out.print("Введите натуральное число = второй множитель");
//        int number2 = scanner.nextInt();
//        System.out.println("Умножать число long a = " + number1 + " на" + number2 + "пока не произойдёт переполнение.");
    }

    public static void checkOverflow(int start, int multiple) {
        long result = start;
        long oldValue = result;

        while (Math.abs(result) < Long.MAX_VALUE) {
            oldValue = Math.abs(result);
            result*= multiple;
            if (Math.abs(result) < Math.abs(oldValue)){
                System.out.println("Переполнение произошло при умножении на " + start);
                break;
            }
        }
        System.out.println("Значение до переполнения: " + oldValue);
        System.out.println("Значение после переполнения: " + result);
    }
}
