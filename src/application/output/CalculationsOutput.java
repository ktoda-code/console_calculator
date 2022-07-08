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

package application.output;

import application.functions.CalculatorFunctions;
import application.functions.LogGenerator;

import java.util.logging.Level;

/**
 * The <b>CalculationsOutput</b> class represents the output of the calculations functions.
 *
 * @author Konstantin Andreev
 */
public class CalculationsOutput {
    private final LogGenerator lg;

    public CalculationsOutput(LogGenerator lg){
        this.lg = lg;
    }

    /**
     * This method returns to the console the output for all functions (e.g: add, ...).
     *
     * @param n1 The first number to be calculated.
     * @param n2 The second number to be calculated against n1.
     */
    public void calculateOutput(int n1, int n2) {
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
