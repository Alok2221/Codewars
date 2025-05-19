package com.codewars.fivekyu;

// Your friend has a list of k numbers: [a1, a2, a3, ... ak].
// He is allowed to do an operation which consists of three steps:
// 1.select two numbers: ai and aj (ai % 2 = 0)
// 2.replace ai with ai / 2
// 3.replace aj with aj * 2
// Help him to find the maximum sum of list elements that is possible to achieve by using this operation (possibly multiple times).
// Return this sum modulo 1_000_000_007, because it can be quite big.
// Input
// List of k elements: [a1, a2, a3, ..., ak]; k < 10**4
// All numbers are positive and smaller than 10**9
// Output
// Maximum sum after some operations (modulo 1_000_000_007)


public class DivideAndMaximize {
    private static final int MOD = 1_000_000_007;

    public static int divideAndMultipy(long[] numbers) {
        long sumWithoutPowers = 0;
        long maxOddPart = 0;
        long totalPower = 0;

        for (long num : numbers) {
            long countPower = 0;
            long x = num;

            while (x % 2 == 0) {
                x /= 2;
                countPower++;
            }

            totalPower += countPower;
            sumWithoutPowers = (sumWithoutPowers + x) % MOD;

            if (x > maxOddPart) {
                maxOddPart = x;
            }
        }

        long powerPart = modPow(totalPower) - 1;
        if (powerPart < 0) powerPart += MOD;

        long add = modMul(maxOddPart, powerPart);
        long result = (sumWithoutPowers + add) % MOD;

        return (int) result;
    }

    private static long modPow(long exp) {
        long result = 1;
        long cur = (long) 2 % DivideAndMaximize.MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * cur) % DivideAndMaximize.MOD;
            }
            cur = (cur * cur) % DivideAndMaximize.MOD;
            exp >>= 1;
        }
        return result;
    }

    private static long modMul(long a, long b) {
        return (a % DivideAndMaximize.MOD) * (b % DivideAndMaximize.MOD) % DivideAndMaximize.MOD;
    }
}