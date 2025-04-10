package com.codewars.sixkyu;

//  In this Kata you have to create a function,named insertMissingLetters,that takes
//  in a string and outputs the same string processed in a particular way.
//  The function should insert only after the first occurrence of each character of the input string, all the alphabet letters that:
//  -are NOT in the original string
//  -come after the letter of the string you are processing
//  Each added letter should be in uppercase, the letters of the original string will always be in lowercase.
//  Example:
//  input: "holly"
//  missing letters: "a,b,c,d,e,f,g,i,j,k,m,n,p,q,r,s,t,u,v,w,x,z"
//  output: "hIJKMNPQRSTUVWXZoPQRSTUVWXZlMNPQRSTUVWXZlyZ"
//  You don't need to validate input, the input string will always contain a certain amount of lowercase letters (min 1 / max 50).

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingAlphabet {

    public static String insertMissingLetters(String input) {
        Set<Character> originalChars = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        Set<Character> processedChars = new java.util.HashSet<>();

        return IntStream.range(0, input.length())
                .mapToObj(i -> {
                    char current = input.charAt(i);
                    if (!processedChars.contains(current)) {
                        processedChars.add(current);
                        String missingLetters = IntStream.range(current + 1, 'z' + 1)
                                .filter(c -> !originalChars.contains((char) c))
                                .mapToObj(c -> String.valueOf((char) c).toUpperCase())
                                .collect(Collectors.joining());
                        return current + missingLetters;
                    }
                    return String.valueOf(current);
                })
                .collect(Collectors.joining());
    }
}