package com.codewars.eightkyu;

//      Given an array of integers your solution should find the smallest integer.
//      For example:
//      Given [34, 15, 88, 2] your solution will return 2
//      Given [34, -345, -1, 100] your solution will return -345
//      You can assume, for the purpose of this kata, that the supplied array will not be empty.

import java.util.stream.IntStream;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        if (IntStream.of(args).min().isPresent()) {
            return IntStream.of(args).min().getAsInt();
        }
        return 0;
    }
}