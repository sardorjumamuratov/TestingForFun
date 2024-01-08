package org.fun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void initialValueOfCalculatorResultsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void addingFiveResultsFive() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void subtractingTwoResultsThree() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.subtract(2);
        assertEquals(3, calculator.getValue());
    }

}