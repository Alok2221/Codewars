package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireAndFuryTest {

    @Test
    public void ex1() {
        assertEquals("I am furious. You and you are fired!", FireAndFury.fireAndFury("FURYYYFIREYYFIRE"));
    }

    @Test
    public void ex2() {
        assertEquals("You are fired! I am really furious. You are fired!", FireAndFury.fireAndFury("FIREYYFURYYFURYYFURRYFIRE"));
    }

    @Test
    public void ex3() {
        assertEquals("Fake tweet.", FireAndFury.fireAndFury("FYRYFIRUFIRUFURE"));
    }
}