package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
        public void SetUp(){
        calc = new Calculator();
        }
    @Test
    public void validate_can_add_two_positiveNums() {
        var result = calc.Add(1,2);
        assertEquals("Test is success!",3, result);
    }

    @Test
    public void validate_can_divide_twoPositiveNums() {
        var result = calc.Divide(6,3);
        assertEquals(2, result);
    }
}