package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertANumberToAStringTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertANumberToAString.numberToString(67));
        assertEquals("123", ConvertANumberToAString.numberToString(123));
        assertEquals("999", ConvertANumberToAString.numberToString(999));
    }

}