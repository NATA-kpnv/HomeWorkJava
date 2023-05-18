package homeWork3.runners;
import homeWork3.calcs.additional.*;
import homeWork3.calcs.simple.*;
import homeWork3.calcs.api.ICalculator;
public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculatorBase = new CalculatorWithMathExtends();
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(
                new CalculatorWithMemoryDecorator( calculatorBase )
        );

        double result1 = calculator.sum(
                calculator.sum(4.1, calculator.multiply(15, 7)),
                calculator.power(calculator.divide(28, 5), 2)
        );

        System.out.println("Result 1: " + result1);

        long countOperation = ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation();
        System.out.println("Count of operations: " + countOperation);

        ICalculator calculatorDecorator1 = ((CalculatorWithCounterAutoDecorator) calculator).getCalculator();
        if (  calculatorDecorator1 instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) calculatorDecorator1).save();
            double savedValue = ((CalculatorWithMemoryDecorator) calculatorDecorator1).load();
            System.out.println("Saved value: " + savedValue);
        }
    }
}
