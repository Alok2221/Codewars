package com.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DotCalculatorTest {
    @Test
    public void exampleTest() {
        assertEquals(".....", DotCalculator.calc("..... // ."));
        assertEquals("..........", DotCalculator.calc("..... * .."));
        assertEquals("..", DotCalculator.calc("..... // .."));
        assertEquals("....", DotCalculator.calc("..... - ."));
        assertEquals("....................", DotCalculator.calc("..... + ..............."));
        assertEquals("...............", DotCalculator.calc("..... * ..."));
        assertEquals("..", DotCalculator.calc("..... - ..."));
        assertEquals("", DotCalculator.calc(". - ."));
        assertEquals("", DotCalculator.calc(". // .."));
    }

}