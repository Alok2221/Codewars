package com.codewars.eightkyu;

//      Very simple, given an integer or a floating-point number, find its opposite.
//      Examples:
//      1: -1
//      14: -14
//      -34: 34

public class OppositeNumber {
    public static int opposite(int number) {
        return Math.negateExact(number);
    }
}