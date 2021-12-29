package com.codewars.eightkyu;

//  Your function takes two arguments:
//  current father's age (years)
//  current age of his son (years)
//  Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {
        if (sonYears == 0) {
            return dadYears;
        } else {
            return Math.abs(dadYears - sonYears * 2);
        }
    }
}