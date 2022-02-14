package com.codewars.eightkyu;

import org.junit.Assert;
import org.junit.Test;

public class HappyBirthdayTest {
    @Test
    public void test() {
        Assert.assertEquals(162, HappyBirthday.wrap(17, 32, 11));
        Assert.assertEquals(124, HappyBirthday.wrap(13, 13, 13));
        Assert.assertEquals(32, HappyBirthday.wrap(1, 3, 1));
    }
}