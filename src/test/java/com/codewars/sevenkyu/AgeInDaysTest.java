package com.codewars.sevenkyu;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AgeInDaysTest {
    @Test
    public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
        LocalDate birthday = LocalDate.now().minusDays(2);
        assertEquals("You are 2 days old",
                AgeInDays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    }

    @Test
    public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
        LocalDate birthday = LocalDate.now().minusYears(1);
        if (LocalDate.now().isLeapYear()) {
            assertEquals("You are 366 days old",
                    AgeInDays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        } else {
            assertEquals("You are 365 days old",
                    AgeInDays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        }
    }
}