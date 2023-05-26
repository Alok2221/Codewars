package com.codewars.eightkyu;

/*      Task
        Provided is a function Kata which accepts two parameters
        in the following order: array, element and returns the index of the element if found and "Not found" otherwise.
        Your task is to shorten the code as much as possible in order to meet the strict character count
        requirements of the Kata. (no more than 161) You may assume that all array elements are unique.*/

import static java.util.Arrays.*;

public class BeConciseIVIndexOfAnElementInAnArray {

    public static String kata(String[] arr, String str) {
        return asList(arr).contains(str) ? String.valueOf(asList(arr).indexOf(str)) : "Not found";
    }

}
