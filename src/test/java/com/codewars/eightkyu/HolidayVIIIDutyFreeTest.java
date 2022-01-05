package com.codewars.eightkyu;

import junit.framework.TestCase;
import org.junit.Test;

// TODO: Replace examples and use TDD development by writing your own tests

public class HolidayVIIIDutyFreeTest extends TestCase {
    @Test
    public void fixedTests() {
        assertEquals(166, HolidayVIIIDutyFree.dutyFree(12, 50, 1000));
        assertEquals(294, HolidayVIIIDutyFree.dutyFree(17, 10, 500));
        assertEquals(357, HolidayVIIIDutyFree.dutyFree(24, 35, 3000));
        assertEquals(20, HolidayVIIIDutyFree.dutyFree(1400, 35, 10000));
        assertEquals(38, HolidayVIIIDutyFree.dutyFree(700, 26, 7000));
    }
}