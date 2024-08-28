package io.github.sahawick.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for Calculator class
 */
public class CalculatorTest {

    Calculator calculator;

    /**
     * Initializes calculator object before each test
     */
    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    /**
     * Verifies that add method returns sum of given two numbers
     *
     * @param numA first number
     * @param numB second number
     * @return sum of numA and numB
     */
    @Test
    public void twoPlusThreeShouldReturnFive() {
        assertEquals(5, calculator.add(2, 3));
    }
}
