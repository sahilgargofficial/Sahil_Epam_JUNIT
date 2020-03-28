package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Test case
    case 1. A is First Char : ABCD => BCD
    case 2. A is present at first 2 chars : AABC => BC
    case 3. A is second char : BACD => BCD
    case 4 . A is not in first 2 chars: BBAA => BBAA
    case 5.  N chars : AABAA => BAA
    case 6.  1 char : A=> "";
    case 7.  2 chars : AA=> "";
    case 8. Empty char : ""=>"";
 */
class RemoveAFromFirst2CharsTest {
    @Test
    void testFirstCharIsA()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("ABCD");
        assertEquals("BCD",result);
    }
    @Test
    void testFirst2CharsAreA()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("AABC");
        assertEquals("BC",result);
    }
    @Test
    void testSecondCharIsA()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("BACD");
        assertEquals("BCD",result);
    }
    @Test
    void testFirst2CharsAreNotA()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    void testNChars()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("AABBAA");
        assertEquals("BBAA",result);
    }
    @Test
    void test1Char()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("A");
        assertEquals("",result);
    }
    @Test
    void test2Char()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("AA");
        assertEquals("",result);
    }
    @Test
    void testEmptyChar()
    {
        RemoveAFromFirst2Chars removeAFromFirst2Chars = new RemoveAFromFirst2Chars();
        String result = removeAFromFirst2Chars.removeA("");
        assertEquals("",result);
    }
}
