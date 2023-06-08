package com.brm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorFunctionsTest {

    @Test
    public void testAdd() {
        CalculatorFunctions calculatorFunctions = new CalculatorFunctions();
        assertEquals(7, calculatorFunctions.add(3, 4), "The result of adding two numbers does not match the expected value.");
    }

    @Test
    public void testSubtract() {
        CalculatorFunctions calculatorFunctions = new CalculatorFunctions();
        assertEquals(85, calculatorFunctions.subtract(97, 12), "The result of subtracting two numbers does not match the expected value.");
    }

    @Test
    public void testMultiply() {
        CalculatorFunctions calculatorFunctions = new CalculatorFunctions();
        assertEquals(144, calculatorFunctions.multiply(12, 12), "The result of multiplying two numbers does not match the expected value.");
    }

    @Test
    public void testDivide() {
        CalculatorFunctions calculatorFunctions = new CalculatorFunctions();
        assertEquals(10, calculatorFunctions.divide(100, 10), "The result of dividing two numbers does not match the expected value.");
    }

    @Test
    public void testSquareRoot() {
        CalculatorFunctions calculatorFunctions = new CalculatorFunctions();
        assertEquals(12, calculatorFunctions.squareRoot(144), "The result of taking the square root of a number does not match the expected value.");
    }
}
