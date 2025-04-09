package com.codewars.fourkyu;

//  Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
//  Any whitespace at the end of the line should also be stripped out.
//  Example:
//  Given an input string of:
//  apples, pears # and bananas
//  grapes
//  bananas !apples
//  The output expected would be:
//  apples, pears
//  grapes
//  bananas
//  The code would be called like so:
//  var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
//  result should == "apples, pears\ngrapes\nbananas"

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder result = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            int commentIndex = line.length();
            for (String symbol : commentSymbols) {
                int index = line.indexOf(symbol);
                if (index != -1 && index < commentIndex) {
                    commentIndex = index;
                }
            }
            String strippedLine = line.substring(0, commentIndex).stripTrailing();
            result.append(strippedLine).append("\n");
        }

        return result.toString().stripTrailing();
    }
}
