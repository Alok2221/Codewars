package com.codewars.sevenkyu;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PartsOfAListTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests partlist");
        String[] s1 = new String[]{"cdIw", "tzIy", "xDu", "rThG"};
        String a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[]{"I", "wish", "I", "hadn't", "come"};
        a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);

        s1 = new String[]{"vJQ", "anj", "mQDq", "sOZ"};
        a = "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]";
        testing(Arrays.deepToString(PartsOfAList.partlist(s1)), a);
    }
}