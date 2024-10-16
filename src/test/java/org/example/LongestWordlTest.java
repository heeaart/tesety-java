package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordlTest {
    @Test
    void longestSentence() {
        LongestWordl longestWordl = new LongestWordl();
        assertEquals("question", longestWordl.longestWord("To be, or not to be, that is the question."));
    }
    @Test
    void longestWord() {
        LongestWordl longestWordl = new LongestWordl();
        assertEquals("Hello", longestWordl.longestWord("Hello World"));
    }
    @Test
    void ifLongestWordIsEmpty() {
        LongestWordl longestWordl = new LongestWordl();
        assertEquals("", longestWordl.longestWord(""));
    }

}