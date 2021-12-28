package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DNAToRNAConversionTest {
    @Test
    public void testDna() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}