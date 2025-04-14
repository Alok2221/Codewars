package com.codewars.eightkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexpBasicsIsItADigitTest {
    @Test
    public void fixedTests() {
        assertFalse(RegexpBasicsIsItADigit.isDigit(""));
        assertTrue(RegexpBasicsIsItADigit.isDigit("7"));
        assertFalse(RegexpBasicsIsItADigit.isDigit(" "));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("a5"));
        assertFalse(RegexpBasicsIsItADigit.isDigit("14"));
    }
}