package io.github.theblacksquidward;

public class IntBoxTest {

    public static void main(String[] args) {
        IntBox a = new IntBox(10).add(10);
        System.out.println(a);
        System.out.println(a.multiply(3));
        System.out.println(a.subtract(5));
    }

}
