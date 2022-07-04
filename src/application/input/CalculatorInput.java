package application.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorInput {
    public int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int number;
        try{
            number  = scanner.nextInt();
            return number;
        }catch (InputMismatchException ime){
            System.err.println("Only Integers are allowed! " + ime);
            throw new InputMismatchException();
        }
    }

}
