package io.github.theblacksquidward;

public class Test {

    public static void main(String[] args) {
        final String prefix = "Error:";
        try {
            TestUtils.assertEquals("harry", "josh", prefix);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
        try {
            TestUtils.assertEquals(1, 2, prefix);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

}
