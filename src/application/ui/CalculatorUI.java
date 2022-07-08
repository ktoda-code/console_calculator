/*
 * MIT License
 *
 * Copyright (c) 2022 Konstantin Andreev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package application.ui;

import application.functions.LogGenerator;
import application.input.CalculatorInput;
import application.output.CalculationsOutput;
import application.output.ConversionsOutput;

/**
 * The <b>CalculatorUI</b> class provides functionality for the User Interface in the console.
 *
 * @author Konstantin Andreev
 */
public class CalculatorUI {
    private int n1,n2;
    private final LogGenerator lg;
    private final CalculationsOutput calout;
    private final ConversionsOutput conout;

    public CalculatorUI(LogGenerator lg) {
        this.lg = lg;
        this.calout = new CalculationsOutput(lg);
        this.conout = new ConversionsOutput();
    }

    /**
     * This method shows the main interface of the application.
     */
    public void showInterface() {
        System.out.println("=====================================");
        System.out.println("\t \t Console Calculator \t \t");
        System.out.println("=====================================");

        System.out.println();

        showMainMenu();
    }

    /**
     * This method is used to take two User inputs respectively, n1 and n2.
     */
    private void computeUserInput(){
        CalculatorInput input = new CalculatorInput(lg);

        System.out.print("Number 1: ");
        n1 = input.getUserInput();

        System.out.print("Number 2: ");
        n2 = input.getUserInput();

        System.out.println();
    }

    /**
     * This method shows the menu of the application. With three options to choose form.
     */
    private void showMainMenu() {
        CalculatorInput input = new CalculatorInput(lg);
        int option;
        do {
            System.out.println("\t\t Choose an option: \t\t");
            System.out.println("-------------------------------------");

            System.out.println("1. Convert Celsius to Fahrenheit, and vice versa.");
            System.out.println("2. Simple calculation between two numbers.");
            System.out.println("To exit: -1");

            option = input.getUserInput();

            selectOptionMainMenu(option);
        } while (option != -1);
    }

    /**
     * This method is used to select the option from the main menu.
     *
     * @param option The option to be selected: {@code -1, 1, 2}
     */
    private void selectOptionMainMenu(int option) {
        switch (option) {
            case 1 -> showConversionsMenu();
            case 2 -> calculations();
            case -1 -> {
            }
            default -> System.out.println("The selected option " + option + " is not listed. \n");
        }
    }

    /**
     * This method is used to show the conversions' menu with three options to choose from.
     */
    private void showConversionsMenu() {
        CalculatorInput input = new CalculatorInput(lg);
        int option;
        do {
            System.out.println("\t\t Choose an option: \t\t");
            System.out.println("-------------------------------------");

            System.out.println("1. Convert Celsius to Fahrenheit.");
            System.out.println("2. Convert Fahrenheit to Celsius.");
            System.out.println("To exit: -1");

            option = input.getUserInput();

            selectOptionConversionMenu(option);
        } while (option != -1);
    }

    /**
     * This method is used to select the option from the conversions' menu.
     *
     * @param option The option to be selected: {@code -1, 1, 2}.
     */
    private void selectOptionConversionMenu(int option) {
        switch (option) {
            case 1 -> temperatureCelsToFahr();
            case 2 -> temperatureFahrToCels();
            case -1 -> {
            }
            default -> System.out.println("The selected option " + option + " is not listed. \n");
        }
    }

    /**
     * This method is used to take User input and show conversion output.
     */
    private void temperatureFahrToCels() {
        System.out.println("\t\t Write a number \t\t");
        System.out.println("-------------------------------------");

        CalculatorInput input = new CalculatorInput(lg);
        System.out.print("Fahrenheit: ");
        int fahr = input.getUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t  Fahrenheit to Celsius \t\t");
        System.out.println("=====================================");

        conout.fahrToCels(fahr);
    }

    /**
     * This method is used to take User input and show conversion output.
     */
    private void temperatureCelsToFahr() {
        System.out.println("\t\t Write a number \t\t");
        System.out.println("-------------------------------------");

        CalculatorInput input = new CalculatorInput(lg);
        System.out.print("Celsius: ");
        int cels = input.getUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t  Celsius to Fahrenheit \t\t");
        System.out.println("=====================================");

        conout.celsToFahr(cels);
    }

    /**
     * This method is used to take User input and show the calculations output.
     */
    private void calculations() {
        System.out.println("\t\t Write two numbers \t\t");
        System.out.println("-------------------------------------");

        computeUserInput();

        System.out.println("=====================================");
        System.out.println("\t \t \t   Output \t\t");
        System.out.println("=====================================");

        calout.calculateOutput(n1,n2);
    }
}
