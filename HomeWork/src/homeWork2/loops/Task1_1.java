package homeWork2.loops;

/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент
 */

public class Task1_1 {
    public static void main(String[] args) {
        long result = 1;

        if (args.length != 1) {
            System.out.println("Введите единственный аргумент");
        } else {
            long n = Long.parseLong(args[0]);
            if (n < 1) {
                System.out.println("Число должно быть положительным и больше 0.");
                return;
            }
            for (long i = 1; i <= n; i++) {
                if (result > Long.MAX_VALUE / i) {
                    System.out.println("Переполнение!");
                    System.out.println("Последний допустимый резул2ьта" + result);
                    return;
                }
                result *= i;
            }
            System.out.println(result);

        }

    }
}

