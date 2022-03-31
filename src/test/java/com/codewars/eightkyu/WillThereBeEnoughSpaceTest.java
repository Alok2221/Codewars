package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WillThereBeEnoughSpaceTest {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, WillThereBeEnoughSpace.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, WillThereBeEnoughSpace.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, WillThereBeEnoughSpace.enough(20, 5, 5));
    }
}