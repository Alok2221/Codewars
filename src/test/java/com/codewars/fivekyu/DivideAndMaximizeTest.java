package com.codewars.fivekyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DivideAndMaximizeTest {
    static Stream<Arguments> sampleTests() {
        return Stream.of(
                arguments(10, new long[]{10}),
                arguments(13, new long[]{3, 4}),
                arguments(50, new long[]{6, 4, 2}),
                arguments(44, new long[]{6, 4, 5}),
                arguments(46, new long[]{1, 2, 3, 4, 5}),
                arguments(68, new long[]{14, 9, 26}),
                arguments(371842558, new long[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8})
        );
    }

    @ParameterizedTest(name = "Input: {1}")
    @MethodSource
    @DisplayName("Sample tests")
    void sampleTests(int expected, long... numbers) {
        assertEquals(expected, DivideAndMaximize.divideAndMultipy(numbers));
    }

}