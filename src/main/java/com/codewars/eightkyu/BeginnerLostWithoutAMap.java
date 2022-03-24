package com.codewars.eightkyu;

//      Given an array of integers, return a new array with each value doubled.
//      For example:
//      [1, 2, 3] --> [2, 4, 6]

import java.util.Arrays;

public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(a -> a * 2).toArray();
    }
}