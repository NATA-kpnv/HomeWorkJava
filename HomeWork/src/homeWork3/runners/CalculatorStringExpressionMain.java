package homeWork3.runners;

import homeWork3.calcs.additional.*;
import homeWork3.calcs.simple.*;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
//      //String expression = "4.1 + 15 * 7 + (28 / 5) ^ 2";
//        double result = 0.00;
        String expression = "2.17/2 + 3.5*(4+2*4 + |5-8|)/2";
        try {
            CalculatorStringExpression calculateExpression = new CalculatorStringExpression(expression);
            double result = calculateExpression.getResult();
            System.out.println(expression + "=" + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
