package com.codewars.sixkyu;

//  You are given two positive integers a and b (a < b <= 20000). Complete the function
//  which returns a list of all those numbers in the interval [a, b) whose digits
//  are made up of prime numbers (2, 3, 5, 7) but which are not primes themselves.
//  Be careful about your timing!
//  Good luck :)

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NotPrimeNumbers {
    public static List<Integer> notPrimes(int a, int b) {
        boolean[] isPrime = new boolean[b];
        if (b > 2) isPrime[2] = true;
        if (b > 3) isPrime[3] = true;

        for (int i = 5; i < b; i += 2) {
            isPrime[i] = true;
        }

        for (int i = 3; i * i < b; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < b; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        return IntStream.range(a, b)
                .filter(num -> hasOnlyPrimeDigits(num) && !isPrime[num])
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean hasOnlyPrimeDigits(int num) {
        return Integer.toString(num)
                .chars()
                .allMatch(c -> "2357".indexOf(c) >= 0);
    }
}
