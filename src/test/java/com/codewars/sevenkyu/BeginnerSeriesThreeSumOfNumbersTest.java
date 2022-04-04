package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeginnerSeriesThreeSumOfNumbersTest {

    BeginnerSeriesThreeSumOfNumbers s = new BeginnerSeriesThreeSumOfNumbers();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}