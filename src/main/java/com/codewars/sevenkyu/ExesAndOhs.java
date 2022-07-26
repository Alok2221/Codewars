package com.codewars.sevenkyu;

//      Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//      Examples input/output:
//      XO("ooxx") => true
//      XO("xooxx") => false
//      XO("ooxXm") => true
//      XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//      XO("zzoo") => false

public class ExesAndOhs {
    public static boolean getXO(String str) {
        int x = 0, o = 0;
        String lowStr = str.toLowerCase();
        for (int i = 0; i < lowStr.length(); i++) {
            if (lowStr.charAt(i) == 'x') {
                x++;
            }
            if (lowStr.charAt(i) == 'o') {
                o++;
            }
        }
        return x == o;
    }
}