package com.codewars.eightkyu;

/*
Your task is to sum the differences between consecutive pairs in the array in descending order.
        For example:
        sumOfDifferences([2, 1, 10])
        Returns 9
        Descending order: [10, 2, 1]
        Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
        If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
*/

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {

        int temp;
        for (int in = 0; in < arr.length; in++) {
            for (int out = 0; out < arr.length - 1 - in; out++) {
                if (arr[out] < arr[out + 1]) {
                    temp = arr[out];
                    arr[out] = arr[out + 1];
                    arr[out + 1] = temp;
                }
            }
        }
        int sum = 0;
        if (arr.length == 1) {
            return 0;
        } else if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length -1; i++) {
                sum = sum + (arr[i]-arr[i+1]);
                }
            }
        return sum;
    }
}