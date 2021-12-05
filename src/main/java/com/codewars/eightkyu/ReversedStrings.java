package com.codewars.eightkyu;

//Complete the solution so that it reverses the string passed into it.
//        'world'  =>  'dlrow'
//        'word'   =>  'drow'

public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}