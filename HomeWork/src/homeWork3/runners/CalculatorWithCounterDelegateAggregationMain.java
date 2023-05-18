package homeWork3.runners;
import homeWork3.calcs.additional.*;
import homeWork3.calcs.simple.*;
public class CalculatorWithCounterDelegateAggregationMain {

    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorBase = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(calculatorBase );

        double result = calculator.sum(calculator.power(calculator.divide(28, 5),2),
                calculator.sum(4.1, calculator.multiply(15,7) ) );

        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result);
        System.out.println("Счётчик операций =  " + calculator.getCountOperation());

    }
}
