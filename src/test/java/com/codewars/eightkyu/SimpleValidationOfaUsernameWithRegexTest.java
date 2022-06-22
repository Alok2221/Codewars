package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleValidationOfaUsernameWithRegexTest {
    @Test
    public void basicTests() {
        assertTrue(SimpleValidationOfaUsernameWithRegex.validateUsr("regex"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr("a"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr("Hass"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr(""));
        assertTrue(SimpleValidationOfaUsernameWithRegex.validateUsr("____"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr("012"));
        assertTrue(SimpleValidationOfaUsernameWithRegex.validateUsr("p1pp1"));
        assertFalse(SimpleValidationOfaUsernameWithRegex.validateUsr("asd43 34"));
        assertTrue(SimpleValidationOfaUsernameWithRegex.validateUsr("asd43_34"));
    }
}