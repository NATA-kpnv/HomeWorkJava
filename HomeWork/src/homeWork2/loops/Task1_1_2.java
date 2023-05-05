package homeWork2.loops;
/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент
 */
public class Task1_1_2 {
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
            result = factorial(n);
            System.out.println(result);


        }
    }

    /*
    Метод нахождения факториала
     */
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        long result = n * factorial(n - 1);
        return result;
    }
}
