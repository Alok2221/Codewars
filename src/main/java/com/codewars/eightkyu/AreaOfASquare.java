package com.codewars.eightkyu;

//      Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input.
//      Return the result rounded to two decimals.
//      Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

import java.math.BigDecimal;

public class AreaOfASquare {
    public static double squareArea(double A) {
        return BigDecimal.valueOf(Math.pow((A * 2 / Math.PI), 2)).setScale(2, BigDecimal.ROUND_DOWN)
                .doubleValue();
    }
}