package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.*;


public class PluralTest {
    @Test
    public void BasicTest() {
        assertTrue(Plural.isPlural(0f));
        assertTrue(Plural.isPlural(0.5f));
        assertFalse(Plural.isPlural(1f));
        assertTrue(Plural.isPlural(100f));
    }
}