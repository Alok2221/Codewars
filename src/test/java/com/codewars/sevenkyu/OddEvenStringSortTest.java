package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OddEvenStringSortTest {

    @Test
    public void sortMyString() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenStringSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenStringSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenStringSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenStringSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenStringSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", OddEvenStringSort.sortMyString("SUBDERMATOGLYPHIC"));

    }
}