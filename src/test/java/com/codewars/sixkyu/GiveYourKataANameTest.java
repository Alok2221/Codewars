package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiveYourKataANameTest {
    @Test
    public void sampleTests() {
        String[] s = {"co", "de", "w", "ar", "s"};
        String[] s2 = {"k", "a", "t", "a"};
        String[] s3 = {"give", "your", "kata", "a", "name"};
        String[] s4 = {"mo", "re", "twi", "zzl", "ers"};
        assertEquals(7, GiveYourKataAName.name(s));//{'co', 'de', 'ar', 's'}
        assertEquals(4, GiveYourKataAName.name(s2));//{'k', 'a', 't', 'a'}
        assertEquals(13, GiveYourKataAName.name(s3));//{'give', 'kata', 'a', 'name'}
        assertEquals(0, GiveYourKataAName.name(s4));//{}
    }
}