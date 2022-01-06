package com.codewars.eightkyu;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class WellOfIdeasEasyVersionTest {
    @Test
    public void basicTests() {
        assertEquals("Fail!", WellOfIdeasEasyVersion.well(new String[]{"bad", "bad", "bad"}));
        assertEquals("Publish!", WellOfIdeasEasyVersion.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", WellOfIdeasEasyVersion.well(new String[]{"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}