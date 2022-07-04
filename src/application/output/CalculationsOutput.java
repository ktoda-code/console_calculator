package application.output;

import application.funtions.CalculatorFunctions;

public class CalculationsOutput {
    public void calculateOutput(int n1, int n2) {
        CalculatorFunctions functions = new CalculatorFunctions();

        System.out.println();

        System.out.println(n1 + " + " + n2 + " = " + functions.add(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + functions.subtract(n1,n2));
        System.out.println(n1 + " * " + n2 + " = " + functions.multiply(n1, n2));

        try {
            System.out.println(n1 + " / " + n2 + " = " + functions.divide(n1, n2));
        } catch (ArithmeticException ae) {
            System.out.println(n1 + " / " + n2 + " = 0");
            throw new ArithmeticException("Divided by zero! " + ae);
        }
        System.out.println();
    }
}
