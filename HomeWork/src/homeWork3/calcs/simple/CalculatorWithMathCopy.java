package homeWork3.calcs.simple;

import homeWork3.calcs.api.ICalculator;

import static java.lang.Math.*;

public class CalculatorWithMathCopy implements ICalculator {
    public CalculatorWithMathCopy() {
    }

    /**
     * Выполняет деление двух чисел.
     *
     * @param a Делимое
     * @param b Делитель
     * @return Результат деления a на b
     */
    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Выполняет вычитание двух чисел.
     *
     * @param a Уменьшаемое
     * @param b Вычитаемое
     * @return Разность чисел a и b
     */
    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * Выполняет сложение двух чисел.
     *
     * @param a Первое слагаемое
     * @param b Второе слагаемое
     * @return Сумма чисел a и b
     */
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Выполняет умножение двух чисел.
     *
     * @param a Первый множитель
     * @param b Второй множитель
     * @return Результат умножения чисел a и b
     */
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Возводит число в степень.
     *
     * @param a Основание степени
     * @param b Показатель степени (целое число)
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
