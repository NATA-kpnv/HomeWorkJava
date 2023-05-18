package homeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result1 = calculateExpression1();
        System.out.println("Результат выражения 1: " + result1);
    }

    private static double calculateExpression1() {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = 4.1 + 15 * 7 + Math.pow(28 / 5.0, 2);
        return result;
    }
}
