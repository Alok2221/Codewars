package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildTowerTest {
    @Test
    public void BasicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.TowerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.TowerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.TowerBuilder(3)));
    }
}