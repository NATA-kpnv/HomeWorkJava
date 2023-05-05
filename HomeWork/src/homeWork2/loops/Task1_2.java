package homeWork2.loops;

public class Task1_2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите единственный аргумент");
        } else {
            //Проверка, что не ввели строку или дробное/отрицательное число
            if (!args[0].matches("\\d+")) {
                if (args[0].matches("^-\\d+(\\.\\d+)?$")) {
                    System.out.println("Введено не целое число");
                } else {
                    System.out.println("Строка содержит не целое положительное число");
                }
                return;
            }

            long number = Long.parseLong(args[0]);
            long input = number;
//            if (number < 0) {
//                System.out.println("Число должно быть положительным.");
//                return;
//            }

            // Разбиваем число на отдельные цифры и перемножаем их
            long result = 1;
            String output = "";
            long oneNumb;
            while (number != 0) {
                oneNumb = number % 10;
                output = "*" + oneNumb + output;
                number /= 10;
                result = oneNumb * result;
            }
            output = output.substring(1); // удаляем первый символ "*"
            System.out.println(output + " = " + result);

        }

    }
}
