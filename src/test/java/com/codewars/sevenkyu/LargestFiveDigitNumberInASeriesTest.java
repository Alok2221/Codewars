package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestFiveDigitNumberInASeriesTest {
    @Test
    public void exampleTests() {
        assertEquals(83910, LargestFiveDigitNumberInASeries.solve("283910"));
        assertEquals(67890, LargestFiveDigitNumberInASeries.solve("1234567890"));
        assertEquals(74765, LargestFiveDigitNumberInASeries.solve("731674765"));
    }
}