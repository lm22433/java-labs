package io.github.theblacksquidward;

public class EnumTest {

    public static void main(String[] args) {
        Sign pos = Sign.POSITIVE;
        Sign neg = Sign.NEGATIVE;

        System.out.println(pos);
        System.out.println(neg);

        Sign flip = pos.flip();

        System.out.println(flip);

    }
}
