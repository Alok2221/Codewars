package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCountTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }
}