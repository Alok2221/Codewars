package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PossibilitiesArrayTest {
    @Test
    public void simpleTests() {
        assertTrue(PossibilitiesArray.isAllPossibilities(new int[]{0, 1, 2, 3}));
        assertFalse(PossibilitiesArray.isAllPossibilities(new int[]{1, 2, 3, 4}));
        assertFalse(PossibilitiesArray.isAllPossibilities(new int[]{6, 0, 4}));
    }
}