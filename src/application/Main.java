package application;
    /*
    TODO:
                []*. Cool Design.
                []*. Conversions (Celsius to Fahrenheit, and, vice versa). (with option selection)
                []*. Log file generation: With date and the operations done.
    */

import application.ui.CalculatorUI;

public class Main {
    public static void main(String[] args) {
        CalculatorUI calc = new CalculatorUI();
        calc.showInterface();
    }
}
