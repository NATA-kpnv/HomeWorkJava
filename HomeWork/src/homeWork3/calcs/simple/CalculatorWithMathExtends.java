package homeWork3.calcs.simple;
import homeWork3.calcs.api.ICalculator;
import static java.lang.Math.sqrt;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public CalculatorWithMathExtends() {
        // вызываем конструктор родительского класса CalculatorWithOperator
        super();
    }

    /**
     * Возводит число в целую степень дробного положительного числа.
     *
     * @param a Основание степени
     * @param b Показатель степени (дробное положительное число)
     * @return Результат возведения числа a в степень b
     */
    @Override
    public double power(double a, double b) {
        if (b % 1 != 0 || b < 0) {
            //   throw new MyCustomException("Exponent must be an integer");
        }
        int exponent = (int) b;
        return Math.pow(a, b);
    }

    /**
     * Вычисляет квадратный корень из числа.
     *
     * @param number Исходное число
     * @return Квадратный корень из числа
     */
    @Override
    public double squareRoot(double number) {
        double sqrt = sqrt(number);
        return sqrt;
    }

    /**
     * Вычисляет модуль числа.
     *
     * @param number Исходное число
     * @return Модуль числа
     */
    @Override
    public double absolute(double number) {
        return Math.abs(number);
    }
}