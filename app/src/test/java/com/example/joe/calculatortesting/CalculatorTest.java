package com.example.joe.calculatortesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void testSubtract(){
        assertEquals(6, calculator.subtract(12,6));
        assertNotEquals(5, calculator.subtract(10,10));
    }

    @Test
    public void testMultiply(){
        assertEquals(64, calculator.multiply(8,8));
        assertNotEquals(24, calculator.multiply(64,3));
    }

    @Test
    public void testIsEqual(){
        assertTrue(calculator.isEqual(2,2));
        assertFalse(calculator.isEqual(4,8));
    }
}
