package com.codewars.sevenkyu;

//      In this Kata, you will be given an array of unique elements, and your task is to rearrange
//      the values so that the first max value is followed by the first minimum, followed by second max value then second min value, etc.
//      For example:
//      solve([15,11,10,7,12]) = [15,7,12,10,11]
//      The first max is 15 and the first min is 7. The second max is 12 and the second min is 10 and so on.
//      More examples in the test cases.

import java.util.Arrays;

public class MaxMinArrays {
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        boolean pickMax = true;

        for (int i = 0; i < n; i++) {
            if (pickMax) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
            pickMax = !pickMax;
        }
        return result;
    }
}
