package com.codewars.fivekyu;

//      Your task is to complete the function which takes a string, and returns an array with all possible rotations of the given string, in uppercase.
//      Example
//      scrollingText("codewars") should return:
//      [ "CODEWARS",
//      "ODEWARSC",
//      "DEWARSCO",
//      "EWARSCOD",
//      "WARSCODE",
//      "ARSCODEW"
//      "RSCODEWA",
//      "SCODEWAR" ]

public class ScrollingText {
    public static String[] scrollingText(String text) {
        text = text.toUpperCase();
        String[] result = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.substring(i) + text.substring(0, i);
        }
        return result;
    }
}
