package com.codewars.sixkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzTest {
    @Test
    public void testValueFour() {
        assertEquals("3->10->5->16->8->4->2->1", Collatz.collatz(3));
    }

    @Test
    public void testValueEight() {
        assertEquals("8->4->2->1", Collatz.collatz(8));
    }
    @Test
    public void testValueSix() {
        assertEquals("6->3->10->5->16->8->4->2->1", Collatz.collatz(6));
    }

    @Test
    public void testValueTwelve() {
        assertEquals("12->6->3->10->5->16->8->4->2->1", Collatz.collatz(12));
    }
}