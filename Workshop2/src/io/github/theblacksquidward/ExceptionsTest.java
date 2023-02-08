package io.github.theblacksquidward;

public class ExceptionsTest {

    public static void main(String[] args) {
        System.out.println(ErrorOrResult.parseIntOrFail("1"));
        System.out.println(ErrorOrResult.parseIntOrFail("harry"));
    }

}
