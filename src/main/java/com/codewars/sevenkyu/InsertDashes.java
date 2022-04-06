package com.codewars.sevenkyu;

//      Write a function insert_dash(num) / insertDash(num) / InsertDash(int num) that will insert dashes ('-') between each two odd digits in num.
//      For example: if num is 454793 the output should be 4547-9-3.
//      Don't count zero as an odd digit.
//      Note that the number will always be non-negative (>= 0).

public class InsertDashes {
    static boolean checkOdd(char ch) {
        return ((ch - '0') & 1) != 0;
    }

    public static String insertDash(int num) {
        String numStr = String.valueOf(num);

        StringBuilder resultStr = new StringBuilder(numStr);

        for (int x = 0; x < numStr.length() - 1; x++) {

            if (checkOdd(numStr.charAt(x)) &&
                    checkOdd(numStr.charAt(x + 1))) {
                resultStr.insert(x + 1, "-");
                numStr = resultStr.toString();
                x++;
            }
        }
        return resultStr.toString();
    }
}