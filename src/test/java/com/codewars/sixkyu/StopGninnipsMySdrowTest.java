package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopGninnipsMySdrowTest {
    @Test
    public void test() {
        assertEquals("emocleW", new StopGninnipsMySdrow().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGninnipsMySdrow().spinWords("Hey fellow warriors"));
    }
}