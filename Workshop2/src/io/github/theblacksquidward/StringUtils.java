package io.github.theblacksquidward;

public class StringUtils {

    static void append(String a) {
        // Not Possible - Strings are IMMUTABLE.
    }

    static String append2(final String a) {
        String newString = a + "b";
        return newString;
    }

    static void concat(StringBox a) {
        String value = a.getValue();
        a.setValue(value + "b");
    }




}
