package com.codewars.sixkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingAlphabetTest {
    @Test
    public void basicTest() {
        assertEquals("hIJKMNPQRSTUVWXYZeFGIJKMNPQRSTUVWXYZlMNPQRSTUVWXYZloPQRSTUVWXYZ", MissingAlphabet.insertMissingLetters("hello"));
    }
}