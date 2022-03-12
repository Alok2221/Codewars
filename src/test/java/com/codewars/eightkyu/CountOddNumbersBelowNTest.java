package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOddNumbersBelowNTest {
    @Test
    public void fixedTests() {
        assertEquals(7, CountOddNumbersBelowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBelowN.oddCount(15023));
    }
}