package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTruckTest {

    @Test
    public void test0() {
        System.out.println("Fixed Tests");
        assertEquals(2940, TankTruck.tankVol(5, 7, 3848));
        assertEquals(907, TankTruck.tankVol(2, 7, 3848));
    }
}