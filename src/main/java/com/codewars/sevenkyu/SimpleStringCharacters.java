package com.codewars.sevenkyu;

//      In this Kata, you will be given a string and your task will be to return a list of ints detailing the count of uppercase letters,
//      lowercase, numbers and special characters, as follows.
//      Solve("*'&ABCDabcde12345") = [4,5,5,3].
//      --the order is: uppercase letters, lowercase, numbers and special characters.

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int[] count = new int[4];
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count[0]++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                count[1]++;
            } else if (Character.isDigit(word.charAt(i))) {
                count[2]++;
            } else {
                count[3]++;
            }
        }
        return count;
    }
}