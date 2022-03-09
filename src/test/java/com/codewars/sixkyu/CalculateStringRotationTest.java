package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateStringRotationTest {
    @Test
    public void test() {
        assertEquals(-1, CalculateStringRotation.shiftedDiff("hoop", "pooh"));
        assertEquals(2, CalculateStringRotation.shiftedDiff("coffee", "eecoff"));
        assertEquals(4, CalculateStringRotation.shiftedDiff("eecoff", "coffee"));
    }
}