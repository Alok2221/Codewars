package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimizeSumOfArrayArraySeriesOneTest {
    @Test
    public void basicTests() {
        assertEquals(22, MinimizeSumOfArrayArraySeriesOne.minSum(new int[]{5, 4, 2, 3}));
        assertEquals(342, MinimizeSumOfArrayArraySeriesOne.minSum(new int[]{12, 6, 10, 26, 3, 24}));
        assertEquals(74, MinimizeSumOfArrayArraySeriesOne.minSum(new int[]{9, 2, 8, 7, 5, 4, 0, 6}));
    }
}