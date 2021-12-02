package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test
    public void testTrue() {
        assertEquals(ConvertABooleanToAString.convert(true), "true");
    }

    @Test
    public void testFalse() {
        assertEquals(ConvertABooleanToAString.convert(false), "false");
    }
}