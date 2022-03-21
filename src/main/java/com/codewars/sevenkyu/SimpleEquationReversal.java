package com.codewars.sevenkyu;

//      Given a mathematical equation that has *,+,-,/, reverse it as follows:
//      solve("100*b/y") = "y/b*100"
//      solve("a+b-c/d*30") = "30*d/c-b+a"
//      More examples in test cases.
//      Good luck!

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleEquationReversal {
    public static String solve(String eq) {
        List<String> reversed = Arrays.asList(eq.split("(?=\\b)"));
        Collections.reverse(reversed);
        return String.join("", reversed);
    }
}