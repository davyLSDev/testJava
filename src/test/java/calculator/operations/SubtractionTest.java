package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractionTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testBasicSubtraction() {
        assertEquals(2, calculator.subtract(4, 2), "4 - 2 should equal 2");
        assertEquals(5, calculator.subtract(10, 5), "10 - 5 should equal 5");
        assertEquals(0, calculator.subtract(3, 3), "3 - 3 should equal 0");
    }

    @Test
    void testSubtractionWithZero() {
        assertEquals(5, calculator.subtract(5, 0), "5 - 0 should equal 5");
        assertEquals(-3, calculator.subtract(0, 3), "0 - 3 should equal -3");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 should equal 0");
    }

    @Test
    void testSubtractionWithNegativeNumbers() {
        assertEquals(-1, calculator.subtract(-3, -2), "-3 - -2 should equal -1");
        assertEquals(-7, calculator.subtract(-4, 3), "-4 - 3 should equal -7");
        assertEquals(7, calculator.subtract(4, -3), "4 - -3 should equal 7");
    }

} 