package homeWork3.calcs.additional;

import homeWork3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;
    private double memory;
    private double temp;

    public CalculatorWithMemoryDecorator (ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public void save() {
        memory = temp;
    }

    public double load() {
        double result = memory;
        memory = 0;
        return result;
    }
    @Override
    public double divide(double a, double b) {
        return temp = calculator.divide(a, b);
    }
    @Override
    public double multiply(double a, double b) {
        return temp = calculator.multiply(a, b);
    }
    @Override
    public double subtraction(double a, double b) {
        return temp = calculator.subtraction(a, b);
    }
    @Override
    public double sum(double a, double b) {
        return temp = calculator.sum(a, b);
    }
    @Override
    public double power(double a, double b) {
        return temp = calculator.power(a, b);
    }
    @Override
    public double squareRoot(double number) {
        return temp = calculator.squareRoot(number);

    }
    @Override
    public double absolute(double number) {
        return temp = calculator.absolute(number);
    }
}
