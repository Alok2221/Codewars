package com.codewars.fivekyu;

//      You need to write regex that will validate a password to make sure it meets the following criteria:
//      At least six characters long
//      contains a lowercase letter
//      contains an uppercase letter
//      contains a digit
//      only contains alphanumeric characters (note that '_' is not alphanumeric)

public class RegexPasswordValidation {
    // assign your pattern string to REGEX, it will be
    // compiled to a Pattern and matched with matches()
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)[a-zA-Z0-9]{6,}$";
}
