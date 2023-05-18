package homeWork3.calcs.additional;
import homeWork3.calcs.api.ICalculator;
public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        countOperation++;
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return calculator.subtraction(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return calculator.sum(a, b);
    }

    @Override
    public double absolute(double a) {
        incrementCountOperation();
        return calculator.absolute(a);
    }

    @Override
    public double power(double a, double b) {
        incrementCountOperation();
        return calculator.power(a, b);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return calculator.squareRoot(a);
    }
}
