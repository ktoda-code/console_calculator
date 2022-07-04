package application.funtions;

public class CalculatorFunctions {
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public int celsiusToFahrenheit(int c) {
        return (c*9/5)+32;
    }

    public int fahrenheitToCelsius(int f) {
        return (f-32)*5/9;
    }

}
