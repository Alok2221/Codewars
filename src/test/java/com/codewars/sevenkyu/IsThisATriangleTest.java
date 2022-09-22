package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsThisATriangleTest {
    @Test
    public void publicTests() {
        assertTrue(IsThisATriangle.isTriangle(1, 2, 2));
        assertFalse(IsThisATriangle.isTriangle(7, 2, 2));
    }
}