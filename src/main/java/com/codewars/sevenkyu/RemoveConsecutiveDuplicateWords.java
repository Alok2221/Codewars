package com.codewars.sevenkyu;

//Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:
//        "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
//        --> "alpha beta gamma delta alpha beta gamma delta"

public class RemoveConsecutiveDuplicateWords {
    public static String removeConsecutiveDuplicates(String s) {
        return s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
    }
}