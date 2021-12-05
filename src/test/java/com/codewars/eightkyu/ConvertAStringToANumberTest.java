package com.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertAStringToANumberTest {
    @Test
    public void test1() {
        assertEquals("stringToNumber(1234)", 1234, ConvertAStringToANumber.stringToNumber("1234"));
    }

    @Test
    public void test2() {
        assertEquals("stringToNumber(605)", 605, ConvertAStringToANumber.stringToNumber("605"));
    }

    @Test
    public void test3() {
        assertEquals("stringToNumber(1405)", 1405, ConvertAStringToANumber.stringToNumber("1405"));
    }

    @Test
    public void test4() {
        assertEquals("stringToNumber(-7)", -7, ConvertAStringToANumber.stringToNumber("-7"));
    }
}
