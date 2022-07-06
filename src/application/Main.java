package application;
    /*
    TODO:
                []*. Add test cases.
                [-]*. Show log-file content. (Special)
    */

import application.functions.LogGenerator;
import application.ui.CalculatorUI;

public class Main {
    public static void main(String[] args) {
        LogGenerator lg = LogGenerator.getInstance();
        CalculatorUI calc = new CalculatorUI(lg);
        calc.showInterface();
    }
}
