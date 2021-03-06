package com.codewars.eightkyu;

//      Grade book
//      Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
//      Numerical Score	Letter Grade
//      90 <= score <= 100	'A'
//      80 <= score < 90	'B'
//      70 <= score < 80	'C'
//      60 <= score < 70	'D'
//      0 <= score < 60	    'F'
//      Tested values are all between 0 and 100. There is no need to check for negative values or values greater than 100.

public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        char grade = ' ';
        if (score >= 90 && score <= 100) {
            grade = 'A';
        }
        if (score >= 80 && score < 90) {
            grade = 'B';
        }
        if (score >= 70 && score < 80) {
            grade = 'C';
        }
        if (score >= 60 && score < 70) {
            grade = 'D';
        }
        if (score >= 0 && score < 60) {
            grade = 'F';
        }
        return grade;
    }
}