package homeWork3.calcs.additional;
import homeWork3.calcs.api.ICalculator;
import homeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator calculator;
    private long countOperation;
    public CalculatorWithCounterAutoAgregationInterface (ICalculator calculator) {
        this.calculator = calculator;
    }
    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    public double subtraction(double a, double b) {
        incrementCountOperation();
        return calculator.subtraction(a, b);
    }

    public double sum(double a, double b) {
        incrementCountOperation();
        return calculator.sum(a, b);
    }

    public double power(double a, double b) {
        incrementCountOperation();
        return calculator.power(a, b);
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return calculator.squareRoot(number);
    }

    public double absolute(double number) {
        incrementCountOperation();
        return calculator.absolute(number);
    }
}
