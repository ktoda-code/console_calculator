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