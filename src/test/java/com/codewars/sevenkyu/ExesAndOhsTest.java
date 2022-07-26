package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExesAndOhsTest {
    @Test
    public void testSomething1() {
        assertTrue(ExesAndOhs.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertTrue(ExesAndOhs.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertFalse(ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertFalse(ExesAndOhs.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertFalse(ExesAndOhs.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue(ExesAndOhs.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertFalse(ExesAndOhs.getXO("Xxxxertr34"));
    }
}