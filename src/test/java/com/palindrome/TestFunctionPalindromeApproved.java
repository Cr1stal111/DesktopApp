package com.palindrome;

import com.palindrome.Palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFunctionPalindromeApproved {

    Palindrome palindrome = new Palindrome();
    
    private static boolean empty;

    private static boolean approve;

    private static boolean reject;

    @BeforeClass
    public static void setUp() {
        approve = true;
        reject = false;
        System.out.println("Testing has started");
    }

    @Test
    public void testPalindromeApproved() {
        assertTrue("String is a palindrome", palindrome.isPalindromeApproved(approve));
    }

    @Test
    public void testPalindromeRejected() {

        assertFalse("String isn\'t a palindrome", palindrome.isPalindromeApproved(reject));
    }
    
    @Test
    public void testPalindromeEmpty() {

        assertFalse("String is empty", palindrome.isPalindromeApproved(empty));
    }

    @AfterClass
    public static void finish() {
        System.out.println("Testing is over");
    }
}
