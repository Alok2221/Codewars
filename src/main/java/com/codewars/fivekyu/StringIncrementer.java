package com.codewars.fivekyu;

//  Your job is to write a function which increments a string, to create a new string.
//  If the string already ends with a number, the number should be incremented by 1.
//  If the string does not end with a number. the number 1 should be appended to the new string.
//  Examples:
//  foo -> foo1
//  foobar23 -> foobar24
//  foo0042 -> foo0043
//  foo9 -> foo10
//  foo099 -> foo100
//  Attention: If the number has leading zeros the amount of digits should be considered.


import java.math.BigInteger;
import java.util.regex.Pattern;

public class StringIncrementer {
    public static String incrementString(String str) {
        return Pattern.compile("(\\d+)$")
                .matcher(str)
                .replaceFirst(m -> {
                    String num = m.group(1);
                    BigInteger inc = new BigInteger(num).add(BigInteger.ONE);
                    String formatted = String.format("%0" + num.length() + "d", inc);
                    return formatted.length() > num.length() ? inc.toString() : formatted;
                })
                .replaceAll("^(.*[^0-9])?$", "$11");
    }
}
