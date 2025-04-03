package com.codewars.sixkyu;

//  Suppose we know the process by which a string s was encoded to a string r (see explanation below).
//  The aim of the kata is to decode this string r to get back the original string s.
//  Explanation of the encoding process:
//  input: a string s composed of lowercase letters from "a" to "z", and a positive integer num
//  we know there is a correspondence between abcde...uvwxyzand 0, 1, 2 ..., 23, 24, 25 : 0 <-> a, 1 <-> b ...
//  if c is a character of s whose corresponding number is x, apply to x the function f: x-> f(x) = num * x % 26, then find ch the corresponding character of f(x)
//  Accumulate all these ch in a string r
//  concatenate num and r and return the result
//
//  For example:
//  encode("mer", 6015)  -->  "6015ekx"
//  m --> 12,   12 * 6015 % 26 = 4,    4  --> e
//  e --> 4,     4 * 6015 % 26 = 10,   10 --> k
//  r --> 17,   17 * 6015 % 26 = 23,   23 --> x
//
//  So we get "ekx", hence the output is "6015ekx"
//  Task
//  A string s was encoded to string r by the above process. complete the function to get back s whenever it is possible.
//  Indeed, it can happen that the decoding is impossible for strings composed of whatever letters from "a" to "z"
//  when positive integer num has not been correctly chosen. In that case return "Impossible to decode".
//
//  Examples
//  decode "6015ekx" -> "mer"
//  decode "5057aan" -> "Impossible to decode"

import java.util.stream.IntStream;

public class ReversingProcess {
    public static String decode(String r) {
        int splitIndex = IntStream.range(0, r.length())
                .filter(i -> !Character.isDigit(r.charAt(i)))
                .findFirst()
                .orElse(r.length());

        if (splitIndex == 0) return "Impossible to decode";

        try {
            int num = Integer.parseInt(r.substring(0, splitIndex));
            return r.substring(splitIndex).chars()
                    .map(c -> c - 'a')
                    .mapToObj(x -> findDecodedChar(x, num))
                    .anyMatch(i -> i == -1)
                    ? "Impossible to decode"
                    : r.substring(splitIndex).chars()
                    .map(c -> c - 'a')
                    .map(x -> findDecodedChar(x, num))
                    .collect(StringBuilder::new,
                            (sb, i) -> sb.append((char) (i + 'a')),
                            StringBuilder::append)
                    .toString();
        } catch (NumberFormatException e) {
            return "Impossible to decode";
        }
    }

    private static int findDecodedChar(int x, int num) {
        int[] solutions = IntStream.range(0, 26)
                .filter(i -> (i * num) % 26 == x)
                .toArray();
        return solutions.length == 1 ? solutions[0] : -1;
    }
}