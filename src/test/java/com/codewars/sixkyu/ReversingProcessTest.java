package com.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversingProcessTest {

    private static void testing_decode(String r, String exp) {
        String actual = ReversingProcess.decode(r);
        assertEquals(exp, actual);
    }

    @Test
    public void test1() {
        testing_decode("1273409kuqhkoynvvknsdwljantzkpnmfgf", "uogbucwnddunktsjfanzlurnyxmx");
        testing_decode("1544749cdcizljymhdmvvypyjamowl", "mfmwhbpoudfujjozopaugcb");
        testing_decode("1877138eieaqgumigywmicwgcgg", "Impossible to decode");
        testing_decode("1122305vvkhrrcsyfkvejxjfvafzwpsdqgp", "rrsxppowmjsrclfljrajtybwviqb");

    }
}
