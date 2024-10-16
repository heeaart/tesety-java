package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    void isNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("Race a car!@"));
    }

    @Test
    void isEmptyPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(""));
    }

}