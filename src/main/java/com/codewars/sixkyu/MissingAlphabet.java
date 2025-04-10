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

import java.util.HashSet;
import java.util.Set;

public class MissingAlphabet {
    public static String insertMissingLetters(String input) {
        Set<Character> originalChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            originalChars.add(c);
        }

        Set<Character> processedChars = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            result.append(current);

            if (!processedChars.contains(current)) {
                processedChars.add(current);
                StringBuilder missingLetters = new StringBuilder();

                for (char letter = (char) (current + 1); letter <= 'z'; letter++) {
                    if (!originalChars.contains(letter)) {
                        missingLetters.append(Character.toUpperCase(letter));
                    }
                }
                result.append(missingLetters);
            }
        }
        return result.toString();
    }
}
