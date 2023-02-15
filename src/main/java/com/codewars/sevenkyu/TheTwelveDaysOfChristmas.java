package com.codewars.sevenkyu;

//      Oh No!
//      The song sheets have been dropped in the snow and the lines of each verse have become all jumbled up.
//      Task
//      You have to write a comparator function which can sort the lines back into their correct order, otherwise Christmas will be cancelled!
//      Reminder: Below is what the final verse should look like
//      On the 12th day of Christmas my true love gave to me
//      12 drummers drumming,
//      11 pipers piping,
//      10 lords a leaping,
//      9 ladies dancing,
//      8 maids a milking,
//      7 swans a swimming,
//      6 geese a laying,
//      5 golden rings,
//      4 calling birds,
//      3 French hens,
//      2 turtle doves and
//      a partridge in a pear tree.
//      Background
//      A Java comparator function is described as below. Other languages are similar:
//      int compare(T o1, T o2) Compares its two arguments for order.
//      Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

import java.util.Comparator;

public class TheTwelveDaysOfChristmas {
    public static class HelpSaveChristmas implements Comparator<String> {
        @Override
        public int compare(final String line1, final String line2) {
            return n(line1) - n(line2);
        }

        private static int n(String line) {
            String s = line.substring(0, line.indexOf(' '));
            int n;
            if (s.equals("On")) {
                n = 13;
            } else if (s.equals("a")) {
                n = 1;
            } else {
                n = Integer.parseInt(s);
            }
            return 13 - n;
        }
    }
}
