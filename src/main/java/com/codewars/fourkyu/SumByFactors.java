package com.codewars.fourkyu;

//  Given an array of positive or negative integers
//  I= [i1,..,in]
//  you have to produce a sorted array P of the form
//  [ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]
//  P will be sorted by increasing order of the prime numbers.
//  The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other languages.
//  Example:
//  I = {12, 15}; result = "(2 12)(3 27)(5 15)"
//  [2, 3, 5] is the list of all prime factors of the elements of I, hence the result.
//  Notes:
//  It can happen that a sum is 0 if some numbers are negative!
//  Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the result,
//  the sum of the numbers for which 5 is a factor is 0, so we have [5, 0] in the result amongst others.

import java.util.Map;
import java.util.TreeMap;

public class SumByFactors {
    public static String sumOfDivided(int[] l) {
        Map<Integer, Integer> primeFactorSums = new TreeMap<>();

        for (int num : l) {
            int absNum = Math.abs(num);
            for (int i = 2; i <= absNum; i++) {
                if (absNum % i == 0 && isPrime(i)) {
                    primeFactorSums.put(i, primeFactorSums.getOrDefault(i, 0) + num);
                    while (absNum % i == 0) {
                        absNum /= i;
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : primeFactorSums.entrySet()) {
            result.append("(").append(entry.getKey()).append(" ").append(entry.getValue()).append(")");
        }

        return result.toString();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}