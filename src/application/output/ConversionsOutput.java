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

/**
 * The <b>ConversionsOutput</b> class represents the output of the conversion functions.
 *
 * @author Konstantin Andreev
 */
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
