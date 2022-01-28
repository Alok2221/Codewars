package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
        assertArrayEquals(new int[]{0}, ConvertNumberToReversedArrayOfDigits.digitize(0));
    }
}