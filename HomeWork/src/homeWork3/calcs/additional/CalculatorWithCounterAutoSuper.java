package homeWork3.calcs.additional;
import homeWork3.calcs.simple.*;
public class CalculatorWithCounterAutoSuper extends  CalculatorWithMathExtends {
    private long countOperation;

    public CalculatorWithCounterAutoSuper() {
        this.countOperation = 0;
    }
    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    @Override
    public double power(double a, double b) {
        incrementCountOperation();
        return super.power( a, b);
    }

    @Override
    public double squareRoot(double number) {
        incrementCountOperation();
        return super.squareRoot(number);
    }

    @Override
    public double absolute(double number) {
        incrementCountOperation();
        return super.absolute(number);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }
}
