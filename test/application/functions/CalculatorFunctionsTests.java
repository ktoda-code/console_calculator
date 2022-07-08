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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorFunctionsTests {
    private CalculatorFunctions cf;

    @BeforeEach
    void setUp() {
        this.cf = new CalculatorFunctions();
    }

    @AfterEach
    void tearDown() {
        this.cf = null;
    }

    @Test
    @DisplayName("TestMultiplication")
    void TestMultiplication() {
        int n1 = 2;
        int n2 = 5;
        int expected = 10;

        assertEquals(expected,cf.multiply(n1, n2));
    }

    @Test
    @DisplayName("TestAddition")
    void TestAddition() {
        int n1 = 5;
        int n2 = 5;
        int expected = 10;

        assertEquals(expected,cf.add(n1, n2));
    }

    @Test
    @DisplayName("TestSubtraction")
    void TestSubtraction() {
        int n1 = 5;
        int n2 = 5;
        int expected = 0;

        assertEquals(expected,cf.subtract(n1, n2));
    }

    @Test
    @DisplayName("TestDivision")
    void TestDivision() {
        int n1 = 5;
        int n2 = 5;
        int expected = 1;

        assertEquals(expected,cf.divide(n1, n2));
    }

    @Test
    @DisplayName("TestDivisionByZero")
    void TestDivisionByZero() {
        int n1 = 5;
        int n2 = 0;

        assertThrows(
                ArithmeticException.class,
                () -> cf.divide(n1, n2)
        );
    }

    @Test
    @DisplayName("TestCelsiusToFahrenheit")
    void TestCelsiusToFahrenheit() {
        int cels = -41;
        int expected = -41;

        assertEquals(expected, cf.celsiusToFahrenheit(cels));
    }

    @Test
    @DisplayName("TestFahrenheitToCelsius")
    void TestFahrenheitToCelsius() {
        int fahr = -41;
        int expected = -40;

        assertEquals(expected, cf.fahrenheitToCelsius(fahr));
    }
}