package com.codewars.eightkyu;

//Make a function that will return a greeting statement that uses an input;
//          your program should return, "Hello, <name> how are you doing today?".
//          [Make sure you type the exact thing I wrote or the program may not execute properly]

public class ReturningStrings {
    public static String greet(String name) {
        String hello = "Hello, ";
        String today = " how are you doing today?";
        return hello + name + today;
    }
}