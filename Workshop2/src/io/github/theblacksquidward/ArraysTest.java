package io.github.theblacksquidward;

public class ArraysTest {

    public static void main(String[] args) {
        int[] xs = new int[] {1,2,6,5};
        int[] ys = new int[] {};
        int[] zs = null;

        try {
            System.out.println(ArraysTest.max(zs));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            System.out.println(ArraysTest.max(ys));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(ArraysTest.max(xs));
    }

    public static int max(int[] xs) {
        if (xs == null) throw new IllegalArgumentException();
        if (xs.length == 0) throw new IllegalArgumentException();
        int maxval = 0;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > maxval) maxval = xs[i];
        }
        return maxval;
    }
}
