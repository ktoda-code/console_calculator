package application.ui;

import application.input.CalculatorInput;
import application.output.CalculatorOutput;

public class CalculatorUI {
    private int n1,n2;

    public void showInterface(){
        System.out.println("=====================================");
        System.out.println("\t \t Console Calculator \t \t");
        System.out.println("=====================================");

        System.out.println();
        System.out.println("\t\t Write two numbers \t\t");
        System.out.println("-------------------------------------");

        computeUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t \t   Output \t\t");
        System.out.println("=====================================");

        computeOutput(n1, n2);
    }

    private void computeUserInput(){
        CalculatorInput input = new CalculatorInput();

        System.out.print("Number 1: ");
        n1 = input.getUserInput();

        System.out.print("Number 2: ");
        n2 = input.getUserInput();

        System.out.println();
    }

    private void computeOutput(int n1, int n2) {
        CalculatorOutput output = new CalculatorOutput();
        output.calculateOutput(n1,n2);
    }

    private void showMenu(){
        // TODO: ...
    }
}
