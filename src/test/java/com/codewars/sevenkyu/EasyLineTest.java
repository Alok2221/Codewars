package com.codewars.sevenkyu;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EasyLineTest {

    private static void testing(BigInteger actual, BigInteger expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testing(EasyLine.easyLine(7), new BigInteger("3432"));
        testing(EasyLine.easyLine(13), new BigInteger("10400600"));
        testing(EasyLine.easyLine(17), new BigInteger("2333606220"));
        testing(EasyLine.easyLine(19), new BigInteger("35345263800"));
    }
}