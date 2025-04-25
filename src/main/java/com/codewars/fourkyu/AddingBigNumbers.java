package com.codewars.fourkyu;

//  We need to sum big numbers and we require your help.
//  Write a function that returns the sum of two numbers.
//  The input numbers are strings and the function must return a string.
//  Example
//  add("123", "321"); -> "444"
//  add("11", "99");   -> "110"
//  Notes
//  The input numbers are big.
//  The input is a string of only digits
//  The numbers are positives

public class AddingBigNumbers {
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = getDigit(a, i--);
            int digitB = getDigit(b, j--);

            int sum = digitA + digitB + carry;
            carry = calculateCarry(sum);
            result.append(getLastDigit(sum));
        }

        return result.reverse().toString();
    }

    private static int getDigit(String num, int index) {
        return index >= 0 ? num.charAt(index) - '0' : 0;
    }

    private static int calculateCarry(int sum) {
        return sum > 9 ? 1 : 0;
    }

    private static int getLastDigit(int sum) {
        return sum > 9 ? sum - 10 : sum;
    }
}
