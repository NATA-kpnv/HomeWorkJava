package HomwWork1;

import java.util.Scanner;

public class Task6_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String message;

        switch (name) {
            case "Вася":
                message = "Привет!\nЯ тебя так долго ждал";
                break;
            case "Анастасия":
                message = "Я тебя так долго ждал";
                break;
            default:
                message = "Добрый день, а вы кто?";
                break;
        }

        System.out.println(message);
    }
}
