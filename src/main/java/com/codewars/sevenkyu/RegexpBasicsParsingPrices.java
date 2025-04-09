package com.codewars.sevenkyu;

//  Implement String#to_cents, which should parse prices expressed as $1.23 and return number of cents, or in case of bad format return null.
//  In this kata, for a price to be considered valid, it must start with a dollar sign ($), followed immediately by a decimal number with exactly 2 decimal digits.

public class RegexpBasicsParsingPrices {
    public static Integer toCents(String price) {
        return price.matches("\\$\\d+\\.\\d{2}") ? Integer.parseInt(price.replaceAll("[$.]", "")) : null;
    }
}
