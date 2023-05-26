package com.codewars.eightkyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeConciseIVIndexOfAnElementInAnArrayTest {

    @Test
    @DisplayName("should behave as expected")
    void testFind() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals(BeConciseIVIndexOfAnElementInAnArray.kata(array, "5"), "2");
        assertEquals(BeConciseIVIndexOfAnElementInAnArray.kata(array, "11"), "4");
    }

    @Test
    @DisplayName("Not found")
    void testNotFound() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals(BeConciseIVIndexOfAnElementInAnArray.kata(array, "843646"), "Not found");
    }

}