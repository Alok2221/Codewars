package com.codewars.sevenkyu;

//      Did you ever want to know how many days old are you? Complete the function which returns your age in days.
//      The birthday is given in the following order: year, month, day.
//      For example if today is 30 November 2015 then
//      ageInDays(2015, 11, 1) returns "You are 29 days old"
//      The birthday is expected to be in the past.
//      Suggestions on how to improve the kata are welcome!

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInDays {
    public static String ageInDays(int year, int month, int day) {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        long days = ChronoUnit.DAYS.between(birthDate, now);
        return "You are " + days + " days old";
    }
}