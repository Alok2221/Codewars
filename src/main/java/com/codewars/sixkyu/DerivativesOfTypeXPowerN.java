package com.codewars.sixkyu;

//      You are provided with a function of the form f(x) = axⁿ, that consists of a single term only and 'a' and 'n' are integers, e.g f(x) = 3x², f(x) = 5 etc.
//      Your task is to create a function that takes f(x) as the argument and returns the result of differentiating the function, that is, the derivative.
//      If f(x)=axn f(x) = ax^nf(x)=ax^n,
//      then f′(x)=nax^n−1 f^{\prime}(x) = nax^{n-1}f^(x)=nax^n−1
//      Input is a string, for example "5x^4". The function f(x) consists of a single term only. Variable is denoted by x.
//      Output should be a string, for example "20x^3".
//      Examples
//      "3x^2"  => "6x"
//      "-5x^3" => "-15x^2"
//      "6x^-2" => "-12x^-3"
//      "5x"    => "5"
//      "-x"    => "-1"
//      "42"    => "0"

public class DerivativesOfTypeXPowerN {
    public static String differentiate(String function) {
        int xIndex = function.indexOf("x");
        if (xIndex == -1 || function.equals("x"))
            return xIndex == -1 ? "0" : "1";
        int num = 1;
        if (xIndex == 1 && function.charAt(0) == '-')
            num = -1;
        else if (xIndex >= 1)
            num = Integer.parseInt(function.substring(0, xIndex));
        int expIndex = function.indexOf("^");
        if (expIndex == -1)
            return num + "";
        int exp = Integer.parseInt(function.substring(expIndex + 1));
        return num * exp + "x" + (exp - 1 == 1 ? "" : "^" + (exp - 1));
    }
}