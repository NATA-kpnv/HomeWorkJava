/*
 * Класс для выполнения примеров побитовых операций с нецелочисленными литералом.
 * Побитовые операции могут использоваться только с целочисленными типами.
 * Поэтому, если нужно использовать нецелочисленые дитерали, то их необходимо преобразовать в целое число
 */

package HomwWork1;

public class Task1_3 {
    public static void main(String[] args) {
        double num = 42.5;
        int numInt = (int) num;

        //Побитовая операция & -AND:
        int resultAnd = numInt & 3; // 00101010 (42) & 00000011 (3) = 00000010 (2)
        System.out.println("Результат операции И: " + resultAnd);

        // Побитовая операция / - OR
        int resultOr = numInt | 3; //  00101010 (42) / 00000011 (3) = 00101011 (43)
        System.out.println("Результат операции ИЛИ: " + resultOr);

        // Побитовая операция ^ - XOR
        int resultXor = numInt ^ 3; // 00101010 (42)  ^ 00000011 (3) = 00101001 (41)
        System.out.println("Результат операции ИСКЛЮЧАЮЩЕЕ ИЛИ: " + resultXor);

        // Сдвиг вправо на 2 бита
        int resultBitwiseRightShift = 42 >> 2; // 00101010 (42) >> 00001010 (10)
        System.out.println("Результат сдвига вправо на 2 бита: " + resultBitwiseRightShift);
        // Сдвиг влево на 2 бита
        int resultBitwiseLeftShift = 42 << 2; // 00101010 (42) << 10101000 (168)
        System.out.println("Результат сдвига влево на 2 бита: " + resultBitwiseLeftShift);
    }
}
