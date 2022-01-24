package com.codewars.sevenkyu;

//      This time no story, no theory. The examples below show you how to write function accum:
//      Examples:
//      accum("abcd") -> "A-Bb-Ccc-Dddd"
//      accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//      accum("cwAt") -> "C-Ww-Aaa-Tttt"
//      The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Mumbling {
    public static String accum(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        int letter = 0;
        for (char c : s.toCharArray()) {
            if (letter > 0) stringBuilder.append('-');
            stringBuilder.append(Character.toUpperCase(c));
            for (int i = 0; i < letter; i++) stringBuilder.append(Character.toLowerCase(c));
            letter++;
        }
        return stringBuilder.toString();
    }
}