package calculator.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testBasicAddition() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
        assertEquals(7, calculator.add(3, 4), "3 + 4 should equal 7");
        assertEquals(10, calculator.add(6, 4), "6 + 4 should equal 10");
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(5, calculator.add(5, 0), "5 + 0 should equal 5");
        assertEquals(3, calculator.add(0, 3), "0 + 3 should equal 3");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3), "-2 + -3 should equal -5");
        assertEquals(-1, calculator.add(-4, 3), "-4 + 3 should equal -1");
        assertEquals(1, calculator.add(4, -3), "4 + -3 should equal 1");
    }
} 