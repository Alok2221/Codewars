package com.codewars.eightkyu;

//Build a function that returns an array of integers from n to 1 where n>0.
//        Example : n=5 --> [5,4,3,2,1]

public class ReversedSequence {
    public static int[] reverse(int n) {
        int[] reved = new int[n];
        for (int i = 0; i < n; i++)
            reved[i] = n - i;
        return reved;
    }
}