package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetCharacterFromAsciiValueTest {
    @Test
    public void testChar() {
        assertEquals('7', GetCharacterFromAsciiValue.getChar(55));
        assertEquals('8', GetCharacterFromAsciiValue.getChar(56));
        assertEquals('9', GetCharacterFromAsciiValue.getChar(57));
        assertEquals(':', GetCharacterFromAsciiValue.getChar(58));
        assertEquals(';', GetCharacterFromAsciiValue.getChar(59));
        assertEquals('<', GetCharacterFromAsciiValue.getChar(60));
        assertEquals('=', GetCharacterFromAsciiValue.getChar(61));
        assertEquals('>', GetCharacterFromAsciiValue.getChar(62));
        assertEquals('?', GetCharacterFromAsciiValue.getChar(63));
        assertEquals('@', GetCharacterFromAsciiValue.getChar(64));
        assertEquals('A', GetCharacterFromAsciiValue.getChar(65));
        assertEquals("getChar should return GetCharacterFromAsciiValue `char`", 0, Character.compare('!', GetCharacterFromAsciiValue.getChar(33)));
    }
}