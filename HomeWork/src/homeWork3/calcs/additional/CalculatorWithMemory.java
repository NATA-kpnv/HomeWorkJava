package homeWork3.calcs.additional;

import homeWork3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double memory;
    private double temp;

    public CalculatorWithMemory (ICalculator calculator) {
        this.calculator = calculator;
    }

    public void save() {
        memory = temp;
    }

    public double load() {
        double result = memory;
        memory = 0;
        return result;
    }

    public double divide(double a, double b) {
        return temp = calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        return temp = calculator.multiply(a, b);
    }

    public double subtraction(double a, double b) {
        return temp = calculator.subtraction(a, b);
    }

    public double sum(double a, double b) {
        return temp = calculator.sum(a, b);
    }

    public double power(double a, double b) {
        return temp = calculator.power(a, b);
    }

    public double squareRoot(double number) {
        return temp = calculator.squareRoot(number);

    }

    public double absolute(double number) {
        return temp = calculator.absolute(number);
    }
}
