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

package application.functions;

/**
 * The <b>CalculatorFunctions</b> class provides with all the functions such as,
 * <i>addition, multiplication, conversions, division</i> and <i>subtraction</i>.
 *
 * @author Konstantin Andreev
 */
public class CalculatorFunctions {
    /**
     * This method is used to make a multiplication operation between two numbers.
     *
     * @param n1 The number to be multiplied.
     * @param n2 The number to be multiplied by n1.
     * @return the result of {@code n1 * n2}.
     */
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * This method is used to make an addition operation between two numbers.
     *
     * @param n1 The number to be added.
     * @param n2 The number to be added by n1.
     * @return the result of {@code n1 + n2}.
     */
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * This method is used to make a subtraction operation between two numbers.
     *
     * @param n1 The number to be subtracted.
     * @param n2 The number to be subtracted by n1.
     * @return the result of {@code n1 - n2}.
     */
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    /**
     * This method is used to make a division operation between two numbers.
     *
     * @param n1 The number that is going to be divided.
     * @param n2 The number that n1 is going to be divided by.
     * @throws ArithmeticException if the value of the second parameter n2 is equal to 0.
     * @return the result of {@code n1 / n2}.
     */
    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    /**
     * This method is used to convert Celsius to Fahrenheit.
     *
     * @param c The value to be converted.
     * @return the value converted in Fahrenheit.
     */
    public int celsiusToFahrenheit(int c) {
        return (c*9/5)+32;
    }

    /**
     * This method is used to convert Fahrenheit to Celsius.
     *
     * @param f The value to be converted.
     * @return the value converted in Celsius.
     */
    public int fahrenheitToCelsius(int f) {
        return (f-32)*5/9;
    }

}
