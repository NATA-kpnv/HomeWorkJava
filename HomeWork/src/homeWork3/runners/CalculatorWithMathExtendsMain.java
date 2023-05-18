package homeWork3.runners;
import homeWork3.calcs.additional.*;
import homeWork3.calcs.simple.*;
public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        calculator.sum(4.1, calculator.multiply(15, 7));
        calculator.save();

        calculator.sum(calculator.load(), calculator.power(calculator.divide(28, 5), 2));
        calculator.save();

        System.out.println("Результат выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2 =  " + calculator.load());
    }
}
