package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NiceArrayTest {
    @Test
    public void sampleTest() {
        assertEquals(true, NiceArray.isNice(new Integer[]{1, 2, 3, 4, 5}));
        assertEquals(true, NiceArray.isNice(new Integer[]{5, 4, 3, 2, 1}));
        assertEquals(false, NiceArray.isNice(new Integer[]{1, 3, 5, 2}));
        assertEquals(false, NiceArray.isNice(new Integer[]{10, 10, 2, 2, 3}));
        assertEquals(false, NiceArray.isNice(new Integer[]{}));
        assertEquals(false, NiceArray.isNice(new Integer[]{1}));
    }
}