package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class ReverseWordsTwoTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWordsTwo.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWordsTwo.reverseWords("apple"));
        assertEquals("a b c d", ReverseWordsTwo.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWordsTwo.reverseWords("double  spaced  words"));
    }

}