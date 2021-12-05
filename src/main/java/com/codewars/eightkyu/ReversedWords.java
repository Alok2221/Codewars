package com.codewars.eightkyu;

//Complete the solution so that it reverses all of the words within the string passed in.
//      Example:
//      "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {
    public static String reverseWords(String str) {

        List<String> list = Arrays.asList(str.split("[\\s]"));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
