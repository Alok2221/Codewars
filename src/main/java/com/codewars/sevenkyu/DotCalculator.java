package com.codewars.sevenkyu;

//      Dot Calculator
//      You have to write a calculator that receives strings for input. The dots will represent the number in the equation.
//      There will be dots on one side, an operator, and dots again after the operator.
//      The dots and the operator will be separated by one space.
//      Here are the following valid operators :
//      + Addition
//      - Subtraction
//      * Multiplication
//      Integer Division
//      Your Work (Task)
//      You'll have to return a string that contains dots, as many the equation returns.
//      If the result is 0, return the empty string. When it comes to subtraction, the first number will always be greater than or equal to the second number.
//      Examples (Input => Output)
//      * "..... + ..............." => "...................."
//      * "..... - ..."             => ".."
//      * "..... - ."               => "...."
//      * "..... * ..."             => "..............."
//      * "..... * .."              => ".........."
//      * "..... // .."             => ".."
//      * "..... // ."              => "....."
//      * ". // .."                 => ""
//      * ".. - .."                 => ""

public class DotCalculator {
    public static String calc(String txt) {
        int firstDots = txt.indexOf(" ");
        int secondDots = txt.length() - firstDots - 3;
        return switch (txt.replace(".", "").trim()) {
            case "+" -> ".".repeat(firstDots + secondDots);
            case "-" -> ".".repeat(firstDots - secondDots);
            case "*" -> ".".repeat(firstDots * secondDots);
            default -> ".".repeat(firstDots / (secondDots - 1));
        };
    }
}