package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleOfTheCharactersEasyTest {
    @Test
    public void basicTests() {
        doTest("AAA", "Z", "Z");
        doTest("ONE", "TWO", "TWO");
        doTest("ONE", "NEO", "Tie!");
        doTest("FOUR", "FIVE", "FOUR");
    }

    private void doTest(final String x, final String y, final String expected) {
        assertEquals(expected, BattleOfTheCharactersEasy.battle(x, y));
    }
}