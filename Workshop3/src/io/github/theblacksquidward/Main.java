package io.github.theblacksquidward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Harry", "Josh", "Lewis", "Fin", "Bagga");
        reverse(names).forEach(System.out::println);
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
