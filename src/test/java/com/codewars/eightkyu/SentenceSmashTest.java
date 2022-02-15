package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentenceSmashTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SentenceSmash.smash(new String[]{"Bilal", "Djaghout"}));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SentenceSmash.smash(new String[]{}));
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SentenceSmash.smash(new String[]{"Bilal"}));
    }
}