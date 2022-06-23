package com.codewars.sevenkyu;

//      A non-empty array a of length n is called an array of all possibilities if it contains all numbers between [0,a.length-1].
//      Write a method named isAllPossibilities that accepts an integer array and returns true if the array is an array of all possibilities, else false.
//      Example:
//      a=[1,2,0,3]
//      a.length-1=3
//      a includes [0,3] ,hence the function should return true

public class PossibilitiesArray {
    public static boolean isAllPossibilities(int[] arg) {
        int argCount = 0;
        int arrayCount = 0;
        for (int i = 0; i < arg.length; i++) {
            arrayCount++;
            argCount += arg[1];

        }
        return arrayCount == argCount;
    }
}