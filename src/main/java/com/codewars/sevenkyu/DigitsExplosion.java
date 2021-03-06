package com.codewars.sevenkyu;
//      Given a string made of digits [0-9], return a string where each digit is repeated a number of times equals to its value.
//      Examples
//      explode("312")
//      should return :
//      "333122"
//
//      explode("102269")
//      should return :
//      "12222666666999999999"

import java.util.stream.Collectors;

public class DigitsExplosion {
    public static String explode(String digits) {
        return digits.chars()
                .mapToObj(c -> Integer.toString(c - '0').repeat(c - '0'))
                .collect(Collectors.joining());
    }
}