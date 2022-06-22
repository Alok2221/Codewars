package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixMeReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertEquals("Sorry, try again :-(", "one-two-three", FixMeReplaceAllDots.replaceDots("one.two.three"));
    }
}