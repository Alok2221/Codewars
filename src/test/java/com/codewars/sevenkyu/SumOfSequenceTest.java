package com.codewars.sevenkyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfSequenceTest {
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertEquals(12, SumOfSequence.sequenceSum(2, 6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, SumOfSequence.sequenceSum(1, 5, 1), "sequenceSum(1, 5, 1)");
        assertEquals(5, SumOfSequence.sequenceSum(1, 5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, SumOfSequence.sequenceSum(0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals(0, SumOfSequence.sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }
}
