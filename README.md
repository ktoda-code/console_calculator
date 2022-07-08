# Simple Console Calculator

---
## Application Overview

### Basic User Interface

```
                        =====================================
                                   Console Calculator 	 	
                        =====================================
                        
                                   Choose an option: 		
                        -------------------------------------
                        1. Convert Celsius to Fahrenheit, and vice versa.
                        2. Simple calculation between two numbers.
                        To exit: -1
                        
                        1
                                   Choose an option: 		
                        -------------------------------------
                        1. Convert Celsius to Fahrenheit.
                        2. Convert Fahrenheit to Celsius.
                        To exit: -1
                        -1
                        
                        ...
                        
                        2
                        	   Write two numbers 		
                        -------------------------------------
                        Number 1: 2
                        Number 2: 2
                        
                        =====================================
                                       Output 		
                        =====================================
                        
                        2 + 2 = 4
                        2 - 2 = 0
                        2 * 2 = 4
                        2 / 2 = 1
```

### Basic Input

```java
import application.functions.LogGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;

class CalculatorInput {
    int getUserInput() {
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
```

```
	 Write two numbers 		
-------------------------------------
Number 1: 3
Number 2: -10
```

### Basic Functionalities:

* **Addition**
* **Subtraction**
* **Multiplication**
* **Division**
* **Temperature Conversion**

```java
class CalculationsOutput {
    void calculateOutput(int n1, int n2) {
        CalculatorFunctions functions = new CalculatorFunctions();

        System.out.println();

        System.out.println(n1 + " + " + n2 + " = " + functions.add(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + functions.subtract(n1,n2));
        System.out.println(n1 + " * " + n2 + " = " + functions.multiply(n1, n2));

        try {
            System.out.println(n1 + " / " + n2 + " = " + functions.divide(n1, n2));
        } catch (ArithmeticException ae) {
            System.out.println(n1 + " / " + n2 + " = 0");
            lg.registerLog(Level.WARNING,"Divided by zero! " + ae);
        }
        System.out.println();
    }
}
```

```java
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
```

#### Output
```
                        =====================================
                                        Output 		
                        =====================================
                        
                        3 + -10 = -7
                        3 - -10 = 13
                        3 * -10 = -30
                        3 / -10 = 0

```

```
                        =====================================
                                Celsius to Fahrenheit 		
                        =====================================
                        
                        Celsius: 22 to Fahrenheit: 71
                        
                        =====================================
                                Fahrenheit to Celsius 		
                        =====================================
                        
                        Fahrenheit: 67 to Celsius: 19
```

