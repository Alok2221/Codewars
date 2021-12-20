package com.codewars.eightkyu;

//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
// Return the resulting string.
//        Note: input will never be an empty string

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder(numberString);
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if ((c == '0') || (c == '1') ||
                    (c == '2') || (c == '3') ||
                    (c == '4')) {
                sb.setCharAt(i, '0');
            }
            if ((c == '5') || (c == '6') ||
                    (c == '7') || (c == '8') ||
                    (c == '9')) {
                sb.setCharAt(i, '1');
            }
        }
        return sb.toString();
    }
}