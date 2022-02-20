package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsNDivisibleByXAndYTest {

    @Test
    public void test1() {
        assertEquals(true, IsNDivisibleByXAndY.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertEquals(false, IsNDivisibleByXAndY.isDivisible(3, 3, 4));
    }
}