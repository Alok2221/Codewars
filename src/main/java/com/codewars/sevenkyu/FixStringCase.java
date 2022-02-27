package com.codewars.sevenkyu;

//      In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is
//      to convert that string to either lowercase only or uppercase only based on:
//      - make as few changes as possible.
//      - if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
//      For example:
//
//      solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
//      solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
//      solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
//      More examples in test cases. Good luck!

import java.util.Objects;

public class FixStringCase {
    public static String solve(final String str) {
        int lowCase = 0;
        int upperCase = 0;

        if (Objects.equals(str, "")) {
            return "";
        } else {
            for (int letter = 0; letter < str.length(); letter++) {
                if (Character.isUpperCase(str.charAt(letter))) {
                    upperCase++;
                } else lowCase++;
            }
            if (lowCase >= upperCase) {
                return str.toLowerCase();
            } else
                return str.toUpperCase();
        }
    }
}