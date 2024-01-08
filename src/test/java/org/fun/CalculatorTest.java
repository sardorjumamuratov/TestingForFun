package org.fun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void initialValueOfCalculatorResultsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

}