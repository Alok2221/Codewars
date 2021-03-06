package com.codewars.sevenkyu;

//      Write a function that doubles every second integer in a list, starting from the left.
//      Example:
//      For input array/list :
//      [1,2,3,4]
//      the function should return :
//      [1,4,3,8]

public class DoubleEveryOther {
    public static int[] doubleEveryOther(int[] a) {
        for (int i = 1; i < a.length; i += 2) {
            a[i] *= 2;
        }
        return a;
    }
}