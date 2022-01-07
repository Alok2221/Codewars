package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperCheckForFactorTest {
    @Test
    public void basicTests() {
        assertEquals(true, GrasshopperCheckForFactor.checkForFactor(10, 2));
        assertEquals(true, GrasshopperCheckForFactor.checkForFactor(63, 7));
        assertEquals(true, GrasshopperCheckForFactor.checkForFactor(2450, 5));
        assertEquals(true, GrasshopperCheckForFactor.checkForFactor(24612, 3));
    }
}