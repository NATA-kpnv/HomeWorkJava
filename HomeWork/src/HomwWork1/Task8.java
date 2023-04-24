package HomwWork1;

public class Task8 {
    public static void main(String[] args) {
        byte number1 = 42;
        System.out.println(toBinaryString(number1)); // 00101010

        byte number2 = 15;
        System.out.println(toBinaryString(number2)); // 00001111

        byte number3 = -42;
        System.out.println(toBinaryString(number3)); // 11010110

        byte number4 = -15;
        System.out.println(toBinaryString(number4)); // 11110001
    }

    public static String toBinaryString(byte number) {
        // Если число положительное, просто возвращаем его двоичное представление
        if (number >= 0) {
            String binaryString = "";
            while (number > 0) {
                binaryString = (number % 2) + binaryString;
                number = (byte) (number / 2);
            }
            // дополнить нулями до 8 бит
            while (binaryString.length() < 8) {
                binaryString = "0" + binaryString;
            }
            return binaryString;

        } else {
            // Если число отрицательное, находим его дополнительный код
            byte complement = (byte) (Math.pow(2, 8) + number); // дополнительный код
            return toBinaryString(complement);
        }
    }
}
