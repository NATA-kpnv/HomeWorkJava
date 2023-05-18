package homeWork3.runners;

import homeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result1 = calculator.divide(28, 5);
        calculator.incrementCountOperation();
        double result2 = calculator.power(result1, 2);
        calculator.incrementCountOperation();
        double result3 = calculator.multiply(15, 7);
        calculator.incrementCountOperation();
        double result4 = calculator.sum(4.1, result3);
        calculator.incrementCountOperation();
        double result5 = calculator.sum(result4, result2);
        calculator.incrementCountOperation();

        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result5);
        System.out.println("Счётчик операций =  " + calculator.getCountOperation());
    }
}
