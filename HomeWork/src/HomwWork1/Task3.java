package HomwWork1;

public class Task3 {
    public static void main(String[] args) {
        //Возведение числа в степень:
        double x = 2;
        double y = 3;
        double result = Math.pow(x, y);
        System.out.println(x + " в степени " + y + " равно " + result);
        //Нахождение квадратного корня из числа:
        double number = 16;
        double sqareNumber = Math.sqrt(number);
        System.out.println("Квадратный корень из " + number + " равен " + sqareNumber);

        //Генерация случайного числа в заданном диапазоне:
        int min = 1;
        int max = 10;
        int randomNumber = min + (int)(Math.random()*((max-min)+1));
        System.out.println("Случайное число от " + min + " до " + max + " равно " +randomNumber);
        //Нахождение наибольшего и наименьшего числа из заданного набора:
        int a = 5, b = 7, c = 3;
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b,c));
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);

    }
}
