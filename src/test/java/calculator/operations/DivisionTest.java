package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testBasicDivision() {
        assertEquals(2, calculator.divide(4, 2), "4 / 2 should equal 2");
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should equal 2");
        assertEquals(1, calculator.divide(3, 3), "3 / 3 should equal 1");
    }

    @Test
    void testDivisionWithZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "5 / 0 should throw an exception");
        assertEquals(0, calculator.divide(0, 3),"0 / 3 should should equal 0");
        assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0), "0 / 0 should throw an exception");
    }

    @Test
    void testDivisionWithNegativeNumbers() {
        assertEquals(1.5, calculator.divide(-3, -2), "-3 / -2 should equal 1.5");
        assertEquals(-1.3333333333333333, calculator.divide(-4, 3), "-4 / 3 should equal -1.3333333333333333");
        assertEquals(-1.3333333333333333, calculator.divide(4, -3), "4 / -3 should equal -1.3333333333333333");
    }

} 