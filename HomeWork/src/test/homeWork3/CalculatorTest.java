package test.homeWork3;

import homeWork3.calcs.api.ICalculator;
import homeWork3.calcs.simple.CalculatorWithMathCopy;
import homeWork3.calcs.simple.CalculatorWithMathExtends;
import homeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
   // double expected = 140.45999999999998;
   //"Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
    double expected = 140.45999999999998;
    double delta = 0.00000000000000001;
    @Test
    public void testCalculatorWithMathCopy(){
        double result = 0.00;
        ICalculator calculator = new CalculatorWithMathCopy();
        result = calculateExpression(calculator);
        Assertions.assertEquals(expected, result, delta);
    }
    @Test
    public void testCalculatorWithMathExtends(){
        double result = 0.00;
        ICalculator calculator = new CalculatorWithMathExtends();
        result = calculateExpression(calculator);
        Assertions.assertEquals(expected, result, delta);
    }
    @Test
    public void testCalculatorWithOperator(){
        double result = 0.00;
        ICalculator calculator = new CalculatorWithOperator();
        result = calculateExpression(calculator);
        Assertions.assertEquals(expected, result, delta);
    }

    public double calculateExpression(ICalculator calculator){
        double result = calculator.sum(calculator.power(calculator.divide(28, 5),2),
                calculator.sum(4.1, calculator.multiply(15,7) ) );

        return result;
        }

}
