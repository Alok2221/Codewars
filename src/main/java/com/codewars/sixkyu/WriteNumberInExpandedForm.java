package com.codewars.sixkyu;

        /*Write Number in Expanded Form
        You will be given a number, and you will need to return it as a string in Expanded Form.
        For example:
        Kata.expandedForm(12); # Should return "10 + 2"
        Kata.expandedForm(42); # Should return "40 + 2"
        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
        NOTE: All numbers will be whole numbers greater than 0.*/

import java.util.Arrays;

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        String[] str = Integer.toString(num).split("");
        for (int i = 0; i < str.length - 1; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                for (int j = i; j < str.length - 1; j++) {
                    str[i] += '0';
                }
            }
        }
        String result = Arrays.toString(str);
        result = result
                .substring(1, result.length() - 1)
                .replace(", 0", "")
                .replace(",", " +");
        return result;
    }
}
