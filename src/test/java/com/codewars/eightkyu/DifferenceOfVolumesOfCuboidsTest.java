package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DifferenceOfVolumesOfCuboidsTest {
    @Test
    public void sampleTestCases() {
        assertEquals(14, DifferenceOfVolumesOfCuboids.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, DifferenceOfVolumesOfCuboids.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, DifferenceOfVolumesOfCuboids.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, DifferenceOfVolumesOfCuboids.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, DifferenceOfVolumesOfCuboids.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}