package calculator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import calculator.operations.AdditionTest;
import calculator.operations.SubtractionTest;

@Suite
@SelectClasses({
    AdditionTest.class,
    SubtractionTest.class,
    // Add more test classes as you add features
})
public class CalculatorTestSuite {
    // This empty class serves as a test suite container
} 