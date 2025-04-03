package com.codewars.fivekyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SnakesLaddersTest {
    @Test
    public void exampleTests() {
        SnakesLadders game = new SnakesLadders();
        Assertions.assertEquals("Player 1 is on square 38", game.play(1, 1));
        Assertions.assertEquals("Player 1 is on square 44", game.play(1, 5));
        Assertions.assertEquals("Player 2 is on square 31", game.play(6, 2));
        Assertions.assertEquals("Player 1 is on square 25", game.play(1, 1));
    }
}