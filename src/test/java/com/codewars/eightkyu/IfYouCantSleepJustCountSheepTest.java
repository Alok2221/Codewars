package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfYouCantSleepJustCountSheepTest {
    @Test
    public void testSomething() {
        assertEquals("", IfYouCantSleepJustCountSheep.countingSheep(0));
        assertEquals("1 sheep...", IfYouCantSleepJustCountSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", IfYouCantSleepJustCountSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", IfYouCantSleepJustCountSheep.countingSheep(3));
    }
}