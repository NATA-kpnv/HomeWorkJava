package homeWork3.runners;

import homeWork3.calcs.additional.*;
import homeWork3.calcs.simple.*;

public class CalculatorWithCounterDelegateChoiceAggregationMain {

    public static void main(String[] args) {
        double result = 0.0;
        CalculatorWithOperator calculatorWithOperatorBase = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopyBase = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtendsBase = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAggregation calculatorWithOperator = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithOperatorBase);
        CalculatorWithCounterAutoChoiceAggregation calculatorWithMathCopy = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithMathCopyBase);
        CalculatorWithCounterAutoChoiceAggregation calculatorWithMathExtends = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithMathExtendsBase);


        System.out.println("CalculatorWithOperator class used for delegegation");
        result = calculatorWithOperator.sum(calculatorWithOperator.power(calculatorWithOperator.divide(28, 5), 2),
                calculatorWithOperator.sum(4.1, calculatorWithOperator.multiply(15, 7)));
        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result);
        System.out.println("Счётчик операций =  " + calculatorWithOperator.getCountOperation());

        System.out.println("CalculatorWithMathCopy class used for delegegation");
        result = calculatorWithMathCopy.sum(calculatorWithMathCopy.power(calculatorWithMathCopy.divide(28, 5), 2),
                calculatorWithMathCopy.sum(4.1, calculatorWithMathCopy.multiply(15, 7)));
        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result);
        System.out.println("Счётчик операций =  " + calculatorWithMathCopy.getCountOperation());

        System.out.println("CalculatorWithMathExtends class used for delegegation");
        result = calculatorWithMathExtends.sum(calculatorWithMathExtends.power(calculatorWithMathExtends.divide(28, 5), 2),
                calculatorWithMathExtends.sum(4.1, calculatorWithMathExtends.multiply(15, 7)));
        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + result);
        System.out.println("Счётчик операций =  " + calculatorWithMathExtends.getCountOperation());
    }

}
