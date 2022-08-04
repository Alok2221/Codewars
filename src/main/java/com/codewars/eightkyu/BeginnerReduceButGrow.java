package com.codewars.eightkyu;

//      Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//      [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        int result = 1;
        for (int j : x) {
            result *= j;
        }
        return result;
    }
}