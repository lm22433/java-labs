package io.github.theblacksquidward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        if (Main.isEqual2("left",false)) System.out.println("Boom");;
        List<String> names = List.of("Harry", "Josh", "Lewis", "Fin", "Bagga");
        reverse(names).forEach(System.out::println);

        Unit x = Unit.INSTANCE;
        Unit y = Unit.INSTANCE;

        if (x == y) System.out.println("Yes");
        if (x.equals(y)) System.out.println("Yes again");

        Maybe<Integer> maybe = Maybe.just(5);
        Maybe<Integer> nothing = Maybe.nothing();

        System.out.println(maybe.get());
        try {
            System.out.println(nothing.get());
        } catch (NoSuchElementException e) {
            System.out.println("Error: Maybe is empty.");
        }
    }

    static boolean isEqual(Object left, Object right) {
        return left.equals(right);
    }

    static <T> boolean isEqual2(T left, T right) {
        return left.equals(right);
    }

    static <T> List<T> reverse(List<T> input) {
        List<T> list = new ArrayList<>(input);
        Collections.reverse(list);
        return list;
    }

}
