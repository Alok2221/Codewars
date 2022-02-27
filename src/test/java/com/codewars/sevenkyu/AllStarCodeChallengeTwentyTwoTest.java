package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllStarCodeChallengeTwentyTwoTest {

    @Test
    public void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", AllStarCodeChallengeTwentyTwo.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", AllStarCodeChallengeTwentyTwo.toTime(3601));
        assertEquals("0 hour(s) and 58 minute(s)", AllStarCodeChallengeTwentyTwo.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", AllStarCodeChallengeTwentyTwo.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", AllStarCodeChallengeTwentyTwo.toTime(0));
    }
}