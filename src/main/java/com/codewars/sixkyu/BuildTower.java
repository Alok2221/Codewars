package com.codewars.sixkyu;

//      Build Tower
//      Build Tower by the following given argument:
//      number of floors (integer and always greater than 0).
//      Tower block is represented as *

//      for example, a tower of 3 floors looks like below
//
//        [
//        "  *  ",
//        " *** ",
//        "*****"
//        ]
//        and a tower of 6 floors looks like below
//
//        [
//        "     *     ",
//        "    ***    ",
//        "   *****   ",
//        "  *******  ",
//        " ********* ",
//        "***********"
//        ]

public class BuildTower {
    public static String[] TowerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            tower[i] = " ".repeat(nFloors - (i + 1)) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - (i + 1));
        }
        return tower;
    }
}