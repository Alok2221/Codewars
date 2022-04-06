package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertDashesTest {
    @Test
    public void sampleTests() {
        assertEquals("4547-9-3", InsertDashes.insertDash(454793));
        assertEquals("123456", InsertDashes.insertDash(123456));
        assertEquals("1003-567", InsertDashes.insertDash(1003567));
    }
}