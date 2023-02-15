package io.github.theblacksquidward;

public class Main {

    public static void main(String[] args) {
        return;
    }

    static boolean isEqual(Object left, Object right) {
        return left.equals(right);
    }

    static <t> boolean isEqual2(t left, t right) {
        return left.equals(right);
    }
}
