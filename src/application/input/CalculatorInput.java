package application.input;

import application.functions.LogGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;

public class CalculatorInput {
    private final LogGenerator lg;

    public CalculatorInput(LogGenerator lg){
        this.lg = lg;
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            return number;
        } catch (InputMismatchException ime) {
            lg.registerLog(Level.WARNING, "Only Integers are allowed! " + ime);
            return 0;
        }
    }
}
