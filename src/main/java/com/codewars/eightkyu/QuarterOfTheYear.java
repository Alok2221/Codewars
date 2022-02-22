package com.codewars.eightkyu;

//      Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
//      For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
//      and month 11 (November), is part of the fourth quarter.

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        int quarter = 0;

        if (month <= 3) {
            quarter = 1;
        } else if (month <= 6) {
            quarter = 2;
        } else if (month <= 9) {
            quarter = 3;
        } else if (month <= 12) {
            quarter = 4;
        }
        return quarter;
    }
}