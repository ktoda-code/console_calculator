package application.ui;

import application.input.CalculatorInput;
import application.output.CalculationsOutput;
import application.output.ConversionsOutput;

public class CalculatorUI {
    private int n1,n2;

    public void showInterface() {
        System.out.println("=====================================");
        System.out.println("\t \t Console Calculator \t \t");
        System.out.println("=====================================");

        System.out.println();

        showMenu();
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
        CalculationsOutput output = new CalculationsOutput();
        output.calculateOutput(n1,n2);
    }

    private void showMenu() {
        CalculatorInput input = new CalculatorInput();
        int option;
        do {
            System.out.println("\t\t Choose an option: \t\t");
            System.out.println("-------------------------------------");

            System.out.println("1. Convert Celsius to Fahrenheit, and vice versa.");
            System.out.println("2. Simple calculation between two numbers.");
            System.out.println("To exit: -1");

            option = input.getUserInput();

            selectOptionMenu(option);
        } while (option != -1);
    }

    private void selectOptionMenu(int option) {
        switch (option) {
            case 1 -> temperatureConversions();
            case 2 -> calculations();
            case -1 -> {
                return;
            }
            default -> System.out.println("The selected option " + option + " is not listed. \n");
        }
    }

    private void temperatureConversions() {
        CalculatorInput input = new CalculatorInput();
        int option;
        do {
            System.out.println("\t\t Choose an option: \t\t");
            System.out.println("-------------------------------------");

            System.out.println("1. Convert Celsius to Fahrenheit.");
            System.out.println("2. Convert Fahrenheit to Celsius.");
            System.out.println("To exit: -1");

            option = input.getUserInput();

            selectOptionConversion(option);
        } while (option != -1);
    }

    private void selectOptionConversion(int option) {
        switch (option) {
            case 1 -> temperatureCelsToFahr();
            case 2 -> temperatureFahrToCels();
            case -1 -> { return;}
            default -> System.out.println("The selected option " + option + " is not listed. \n");
        }
    }

    private void temperatureFahrToCels() {
        System.out.println("\t\t Write a number \t\t");
        System.out.println("-------------------------------------");

        CalculatorInput input = new CalculatorInput();
        System.out.print("Fahrenheit: ");
        int fahr = input.getUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t  Fahrenheit to Celsius \t\t");
        System.out.println("=====================================");

        ConversionsOutput output = new ConversionsOutput();
        output.fahrToCels(fahr);
    }

    private void temperatureCelsToFahr() {
        System.out.println("\t\t Write a number \t\t");
        System.out.println("-------------------------------------");

        CalculatorInput input = new CalculatorInput();
        System.out.print("Celsius: ");
        int cels = input.getUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t  Celsius to Fahrenheit \t\t");
        System.out.println("=====================================");

        ConversionsOutput output = new ConversionsOutput();
        output.celsToFahr(cels);
    }

    private void calculations() {
        System.out.println("\t\t Write two numbers \t\t");
        System.out.println("-------------------------------------");

        computeUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t \t   Output \t\t");
        System.out.println("=====================================");

        computeOutput(n1, n2);
    }
}
