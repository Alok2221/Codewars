package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeConciseITheTernaryOperatorTest {
    @Test
    public void basicTests() {
        assertEquals("You're a(n) kid", BeConciseITheTernaryOperator.describeAge(9));
        assertEquals("You're a(n) kid", BeConciseITheTernaryOperator.describeAge(10));
        assertEquals("You're a(n) kid", BeConciseITheTernaryOperator.describeAge(11));
        assertEquals("You're a(n) kid", BeConciseITheTernaryOperator.describeAge(12));
        assertEquals("You're a(n) teenager", BeConciseITheTernaryOperator.describeAge(13));
        assertEquals("You're a(n) teenager", BeConciseITheTernaryOperator.describeAge(14));
        assertEquals("You're a(n) teenager", BeConciseITheTernaryOperator.describeAge(15));
        assertEquals("You're a(n) teenager", BeConciseITheTernaryOperator.describeAge(16));
        assertEquals("You're a(n) teenager", BeConciseITheTernaryOperator.describeAge(17));
        assertEquals("You're a(n) adult", BeConciseITheTernaryOperator.describeAge(18));
        assertEquals("You're a(n) adult", BeConciseITheTernaryOperator.describeAge(19));
        assertEquals("You're a(n) adult", BeConciseITheTernaryOperator.describeAge(63));
        assertEquals("You're a(n) adult", BeConciseITheTernaryOperator.describeAge(64));
        assertEquals("You're a(n) elderly", BeConciseITheTernaryOperator.describeAge(65));
        assertEquals("You're a(n) elderly", BeConciseITheTernaryOperator.describeAge(66));
        assertEquals("You're a(n) elderly", BeConciseITheTernaryOperator.describeAge(100));
    }

}