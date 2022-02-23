package com.codewars.sevenkyu;

//      In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//      Examples
//      highAndLow("1 2 3 4 5")  // return "5 1"
//      highAndLow("1 2 -3 4 5") // return "5 -3"
//      highAndLow("1 9 3 4 -5") // return "9 -5"
//      Notes
//      All numbers are valid Int32, no need to validate them.
//      There will always be at least one number in the input string.
//      Output string must be two numbers separated by a single space, and highest number is first.

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        String[] splitStr = numbers.split(" ");
        int lNum = Integer.parseInt(splitStr[0]);
        int hNum = Integer.parseInt(splitStr[0]);
        for (int i = 1; i < splitStr.length; i++) {
            if (lNum > Integer.parseInt(splitStr[i]))
                lNum = Integer.parseInt(splitStr[i]);
            if (hNum < Integer.parseInt(splitStr[i]))
                hNum = Integer.parseInt(splitStr[i]);
        }
        return (hNum) + " " + (lNum);
    }
}