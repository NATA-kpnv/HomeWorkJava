package homeWork3.calcs.additional;
import homeWork3.calcs.simple.*;
public class CalculatorWithCounterAutoChoiceAggregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;

    private CalculatorWithMathExtends calculatorWithMathExtends;
    private long countOperation;


    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calculator) {
        this.calculatorWithMathExtends = calculator;
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.divide(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.divide(a, b);
        }
        throw  new IllegalStateException ("No calculator instance");
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiply(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multiply(a, b);
        }
        throw new IllegalStateException("No calculator instance");
    }

    public double subtraction(double a, double b) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.subtraction(a, b);
        }
        throw new IllegalStateException("No calculator instance");
    }

    public double sum(double a, double b) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.sum(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sum(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sum(a, b);
        }
        throw new IllegalStateException("No calculator instance");
    }

    public double power(double a, double b) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.power(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.power(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.power(a, b);
        }
        throw new IllegalStateException("No calculator instance");
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.squareRoot(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.squareRoot(number);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.squareRoot(number);
        }
        throw new IllegalStateException("No calculator instance");
    }

    public double absolute(double number) {
        incrementCountOperation();
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.absolute(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.absolute(number);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.absolute(number);
        }
        throw new IllegalStateException("No calculator instance");
    }

}
