package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomesTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", DetermineOffspringSexBasedOnGenesXXAndXYChromosomes.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspringSexBasedOnGenesXXAndXYChromosomes.chromosomeCheck("XX"));
    }

}