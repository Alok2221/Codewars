package com.codewars.sevenkyu;

/*      Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
        Examples
        "This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsTwo {
    public static String reverseWords(final String original) {
        String[] array = original.split(" ");
        if (array.length == 0) {
            return original;
        }
        return Arrays.stream(original.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }

}
