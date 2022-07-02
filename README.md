# Simple Console Calculator

---
## Application Overview

### Basic User Interface

```
                        =====================================
                                  Console Calculator 	 	
                        =====================================
                        
                                  Write two numbers 		
                        -------------------------------------
                        Number 1: 3
                        Number 2: -10
                        
                        =====================================
                                        Output 		
                        =====================================
                        
                        3 + -10 = -7
                        3 - -10 = 13
                        3 * -10 = -30
                        3 / -10 = 0

```

### Basic Input for Two numbers

```java
import java.util.InputMismatchException;
import java.util.Scanner;

class CalculatorInput {
     int getUserInput(){
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

```java
class CalculatorOutput {
     void calculateOutput(int n1, int n2) {
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

