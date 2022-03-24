package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionThreeMultiplyingTwoNumbersTest {
    @Test
    public void sampleTest() {
        assertEquals(4, FunctionThreeMultiplyingTwoNumbers.multiply(2, 2));
        assertEquals(10, FunctionThreeMultiplyingTwoNumbers.multiply(5, 2));
        assertEquals(100, FunctionThreeMultiplyingTwoNumbers.multiply(100, 1));
        assertEquals(0, FunctionThreeMultiplyingTwoNumbers.multiply(0, 1000));
    }
}