package com.codewars.sixkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPhoneNumberTest {
    @Test
    public void tests() {
        assertTrue(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertFalse(ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertFalse(ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
    }
}