package com.codewars.sevenkyu;

//      Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it.
//      If the two numbers are equal return a or b.
//      Note: a and b are not ordered!
//      Examples (a, b) --> output (explanation)
//      (1, 0) --> 1 (1 + 0 = 1)
//      (1, 2) --> 3 (1 + 2 = 3)
//      (0, 1) --> 1 (0 + 1 = 1)
//      (1, 1) --> 1 (1 since both are same)
//      (-1, 0) --> -1 (-1 + 0 = -1)
//      (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)


public class BeginnerSeriesThreeSumOfNumbers {
    public int GetSum(int a, int b) {
        int sum = 0;

        if (a == b) {
            return a;
        }
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }
}