package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    public void testGcd() {
        assertEquals(6, GreatestCommonDivisor.compute(30, 12));
        assertEquals(1, GreatestCommonDivisor.compute(8, 9));
        assertEquals(1, GreatestCommonDivisor.compute(1, 1));
    }
}