package com.codewars.fivekyu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegexPasswordValidationTest {
    static private Pattern pattern;

    @BeforeAll
    static void parseRegex() {
        pattern = Pattern.compile(RegexPasswordValidation.REGEX);
    }

    private void doTest(String password, boolean expected) {
        boolean actual = pattern.matcher(password).matches();
        assertEquals(expected, actual, "for password: \"" + password + "\"");
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest("fjd3IR9", true);
        doTest("ghdfj32", false);
        doTest("DSJKHD23", false);
        doTest("dsF43", false);
        doTest("4fdg5Fj3", true);
        doTest("DHSJdhjsU", false);
        doTest("fjd3IR9.;", false);
        doTest("fjd3  IR9", false);
        doTest("djI38D55", true);
        doTest("djI3_8D55", false);
        doTest("djI38D55@@", false);
        doTest("a2.d412", false);
        doTest("JHD5FJ53", false);
        doTest("!fdjn345", false);
        doTest("jfkdfj3j", false);
        doTest("123", false);
        doTest("abc", false);
        doTest("123abcABC", true);
        doTest("ABC123abc", true);
        doTest("Password123", true);
    }
}
