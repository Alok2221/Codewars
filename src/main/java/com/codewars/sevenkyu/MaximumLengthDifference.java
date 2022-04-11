package com.codewars.sevenkyu;

//      You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z.
//      Let x be any string in the first array and y be any string in the second array.
//      Find max(abs(length(x) − length(y)))
//      If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//      Example:
//      a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//      a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//      mxdiflg(a1, a2) --> 13
//      Bash note:
//      input : 2 strings with substrings separated by ,
//      output: number as a string

public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int maxOne = 0, minOne = Integer.MAX_VALUE, maxTwo = 0,
                minTwo = Integer.MAX_VALUE;
        for (String s : a1) {
            int len = s.length();
            maxOne = Math.max(maxOne, len);
            minOne = Math.min(minOne, len);
        }
        for (String s : a2) {
            int len = s.length();
            maxTwo = Math.max(maxTwo, len);
            minTwo = Math.min(minTwo, len);
        }
        return Math.max(maxOne, maxTwo) - Math.min(minOne, minTwo);
    }
}