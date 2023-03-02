package com.codewars.sevenkyu;
/*      Intro
        These arrays are too long! Let's reduce them!
        Description
        Write a function that takes in an array of integers from 0-9, and returns a new array:
        Numbers with no identical numbers preceding or following it returns a 1: 2, 4, 9  => 1, 1, 1
        Sequential groups of identical numbers return their count: 6, 6, 6, 6 => 4
        Example
        [0, 4, 6, 8, 8, 8, 5, 5, 7] => [1, 1, 1, 3, 2, 1]
        Your function should then repeat the process on the resulting array, and on the resulting array of that, until it returns a single integer:
        [0, 4, 6, 8, 8, 8, 5, 5, 7] =>  [1, 1, 1, 3, 2, 1] => [3, 1, 1, 1] => [1, 3] => [1, 1] => [2]
        When your function has reduced the array to a single integer following these rules, it should return that integer.
        [2] => 2
        Rules and assertions
        All test arrays will be 2+ in length
        All integers in the test arrays will be positive numbers from 0 - 9
        You should return an integer, not an array with 1 element*/

import java.util.LinkedList;

public class SetReducer {
    public static int setReducer(int[] input) {
        return input.length > 1 ? setReducer(reduce(input)) : input[0];
    }

    private static int[] reduce(int[] input) {
        var stats = new LinkedList<Integer>();
        int j = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[j]) {
                stats.add(i - j);
                j = i;
            }
        }
        stats.add(input.length - j);
        return stats.stream().mapToInt(i -> i).toArray();
    }

}