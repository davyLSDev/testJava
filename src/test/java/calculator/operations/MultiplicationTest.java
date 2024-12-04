package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testBasicMultiplication() {
        assertEquals(8, calculator.multiply(4, 2), "4 * 2 should equal 8");
        assertEquals(50, calculator.multiply(10, 5), "10 * 5 should equal 50");
        assertEquals(9, calculator.multiply(3, 3), "3 * 3 should equal 9");
    }

    @Test
    void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal 0");
        assertEquals(0, calculator.multiply(0, 3), "0 * 3 should equal 0");
        assertEquals(0, calculator.multiply(0, 0), "0 * 0 should equal 0");
    }

    @Test
    void testMultiplicationWithNegativeNumbers() {
        assertEquals(6, calculator.multiply(-3, -2), "-3 * -2 should equal 6");
        assertEquals(-12, calculator.multiply(-4, 3), "-4 * 3 should equal -12");
        assertEquals(-12, calculator.multiply(4, -3), "4 * -3 should equal -12");
    }

} 