package application.output;

import application.funtions.CalculatorFunctions;

public class ConversionsOutput {
    public void celsToFahr(int cels) {
        CalculatorFunctions functions = new CalculatorFunctions();

        System.out.println();

        System.out.println("Celsius: " + cels + " to Fahrenheit: " + functions.celsiusToFahrenheit(cels));

        System.out.println();
    }

    public void fahrToCels(int fahr) {
        CalculatorFunctions functions = new CalculatorFunctions();

        System.out.println();

        System.out.println("Fahrenheit: " + fahr + " to Celsius: " + functions.fahrenheitToCelsius(fahr));

        System.out.println();
    }
}
