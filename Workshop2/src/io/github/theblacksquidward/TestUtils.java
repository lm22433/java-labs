package io.github.theblacksquidward;

public class TestUtils {

    static void assertEquals(String expected, String actual, String prefix) {
        if (!expected.equals(actual)) throw new AssertionError(prefix + " expecting " + expected + " but was " + actual);
    }

    static void assertEquals(int expected, int actual, String prefix) {
        if (expected != actual) throw new AssertionError(prefix + " expected " + expected + " got " + actual);
    }

}
