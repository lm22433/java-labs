package io.github.theblacksquidward;

public class Vector2DTest {

    public static void main(String[] args) {
        Vector2D a = new Vector2D(10.0, 10.0);
        System.out.println(a);
        System.out.println(a.add(a));
        System.out.println(a.scale(2.5));
        Vector2D b = new Vector2D(11.0, 12.0);
        System.out.println(a.distance(b));
    }

}
