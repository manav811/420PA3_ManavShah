package Assignment;

public class Calculator { private double result;

    public Calculator() {
        this.result = 0;
    }

    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        result = a / b;
        return result;
    }

    public double getResult() {
        return result;
    }
}
