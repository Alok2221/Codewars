package com.codewars.eightkyu;

//      The code provided is supposed replace all the dots . in the specified String str with dashes -
//      But it's not working properly.
//      Task
//      Fix the bug so we can all go home early.
//      Notes
//      String str will never be null.

public class FixMeReplaceAllDots {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}