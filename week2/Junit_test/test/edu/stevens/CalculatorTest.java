package edu.stevens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    double eps= 1e-5;

    @Test
    void multiply() {
        assertEquals(15, calculator.multiply(3, 5), "error when multiply");
    }

    @Test
    void divide() {
        assertTrue(Math.abs(calculator.divide(3, 5)-0.6)<eps);
//        assertEquals(0.6, calculator.divide(3, 5));
    }
}