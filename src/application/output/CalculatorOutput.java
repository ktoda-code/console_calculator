package application.output;

public class CalculatorOutput {
    public void calculateOutput(int n1, int n2) {
        System.out.println();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));

        try {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (ArithmeticException ae) {
            System.out.println(n1 + " / " + n2 + " = 0");
            throw new ArithmeticException("Divided by zero! " + ae);
        }
    }
}
