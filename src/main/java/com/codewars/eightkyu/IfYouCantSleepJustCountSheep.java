package com.codewars.eightkyu;

//      If you can't sleep, just count sheep!!
//      Task:
//      Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//      Input will always be valid, i.e. no negative integers.

public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        String sheepCount = " sheep...";
        StringBuilder stringBuilder = new StringBuilder();
        if (num == 0) {
            return "";
        }
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(sheepCount);
        }
        return stringBuilder.toString();
    }
}