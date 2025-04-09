package com.codewars.fivekyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGeneticAlgorithmsTest {

    @Test
    public void testEvolveToTargetString() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "hello";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the target string");
    }

    @Test
    public void testEvolveWithDifferentTarget() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "world";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the target string");
    }

    @Test
    public void testEvolveWithEmptyString() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should be an empty string");
    }

    @Test
    public void testEvolveWithSingleCharacter() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "a";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the single-character target");
    }

    @Test
    public void testEvolveWithSpecialCharacters() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "abc123!@#";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the target with special characters");
    }

    @Test
    public void testEvolveWithUpperCase() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "HELLO";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the uppercase target");
    }

    @Test
    public void testEvolveWithMixedCharacters() {
        BinaryGeneticAlgorithms ga = new BinaryGeneticAlgorithms();
        String target = "H3ll0!";
        String result = ga.evolve(target);
        assertEquals(target, result, "The evolved string should match the mixed-character target");
    }
}