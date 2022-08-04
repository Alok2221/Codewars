package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsDigitalRootTest {
    @Test
    public void Test1() {
        assertEquals("Nope!", 7, SumOfDigitsDigitalRoot.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals("Nope!", 6, SumOfDigitsDigitalRoot.digital_root(456));
    }
}