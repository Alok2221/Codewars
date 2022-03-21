package com.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsSatorSquareTest {
    @Test
    void test3x3() {
        assertEquals(true, IsSatorSquare.isSatorSquare(new char[][]{{'P', 'E', 'R'},
                {'E', 'V', 'E'},
                {'R', 'E', 'P'}}));
    }

    @Test
    void test4x4() {
        assertEquals(false, IsSatorSquare.isSatorSquare(new char[][]{{'K', 'N', 'I', 'T'},          // warning:
                {'N', 'O', 'R', 'I'},          // O and 0 look similar
                {'I', 'R', '0', 'N'},          // but are not the same
                {'T', 'I', 'N', 'K'}}));
    }

    @Test
    void test5x5() {
        assertEquals(true, IsSatorSquare.isSatorSquare(new char[][]{{'S', 'A', 'T', 'O', 'R'},
                {'A', 'R', 'E', 'P', 'O'},
                {'T', 'E', 'N', 'E', 'T'},
                {'O', 'P', 'E', 'R', 'A'},
                {'R', 'O', 'T', 'A', 'S'}}));
    }
}