package com.palindrome;

import com.palindrome.Palindrome;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFunctionPalindromeRejected {

    Palindrome palindrome = new Palindrome();

    @BeforeClass
    public static void setUp() {
        System.out.println("Testing has started");
    }

    @Test
    public void testPalindromeString() {
        assertEquals(false, palindrome.isPalindromeRejected(""));
        assertEquals(true, palindrome.isPalindromeRejected("teeet"));
    }

    @AfterClass
    public static void finish() {
        System.out.println("Testing is over");
    }
}
