package com.codewars.eightkyu;

//      Task
//      Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.
//      Example
//      Input: 1,3,5,6,7,8
//      Output: 1,2,3,4,5,6,7,8

import java.util.stream.IntStream;

public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}