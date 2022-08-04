package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeginnerReduceButGrowTest {
    @Test
    public void testSomething() {
        assertEquals(6, BeginnerReduceButGrow.grow(new int[]{1, 2, 3}));
        assertEquals(16, BeginnerReduceButGrow.grow(new int[]{4, 1, 1, 1, 4}));
        assertEquals(64, BeginnerReduceButGrow.grow(new int[]{2, 2, 2, 2, 2, 2}));
    }
}