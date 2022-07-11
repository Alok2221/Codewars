package com.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HerosRootTest {

    @Test
    public void test0() {
        System.out.println("Fixed Tests");
        assertEquals(4, HerosRoot.IntRac(25, 1));
        assertEquals(4, HerosRoot.IntRac(125348, 300), 3);
    }
}