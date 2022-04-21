package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WilsonPrimesTest {
    @Test
    public void test1() {
        assertFalse(WilsonPrimes.am_i_wilson(0));
    }

    @Test
    public void test2() {
        assertFalse(WilsonPrimes.am_i_wilson(1));
    }

    @Test
    public void test3() {
        assertTrue(WilsonPrimes.am_i_wilson(5));
    }
}