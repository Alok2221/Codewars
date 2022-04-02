package com.codewars.sevenkyu;

import com.codewars.sevenkyu.LinkedListsGetNthNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListsGetNthNodeTest {

    @Test
    public void test2() {
        LinkedListsGetNthNode n = new LinkedListsGetNthNode();
        n.data = 1337;
        n.next = new LinkedListsGetNthNode();
        n.next.data = 42;
        n.next.next = new LinkedListsGetNthNode();
        n.next.next.data = 23;
        try {
            assertEquals(LinkedListsGetNthNode.getNth(n, 0), 1337);
            assertEquals(LinkedListsGetNthNode.getNth(n, 1), 42);
            assertEquals(LinkedListsGetNthNode.getNth(n, 2), 23);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void testNull() {
        try {
            LinkedListsGetNthNode.getNth(null, 0);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }


    @Test
    public void testWrongIdx() {
        try {
            LinkedListsGetNthNode.getNth(new LinkedListsGetNthNode(), 1);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}