package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterErrorsTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", PrinterErrors.printerError(s));
    }
}