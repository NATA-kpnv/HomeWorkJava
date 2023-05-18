
package homeWork3.runners;
import  homeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {
        // Вычисление выражений 4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.sum(calculator.power(calculator.divide(28, 5),2),
                calculator.sum(4.1, calculator.multiply(15,7) ) );

        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result);

    }
}

