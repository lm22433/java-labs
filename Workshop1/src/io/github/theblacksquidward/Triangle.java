package io.github.theblacksquidward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    String triangleType() {
        List<Integer> ints = new ArrayList<>(List.of(a, b, c));
        Collections.sort(ints);
        int x = ints.get(0);
        int y = ints.get(1);
        int z = ints.get(2);

        if(x == y && x == z) return "Equilateral";
        else if(x*x + y*y == z*z) return "RightAngled";
        else if(x == y || x == z || y == z) return "Isosceles";
        else if(x + y == z) return "Flat";
        else if(x + y < z) return "Impossible";
        else return "Scalene";
    }

    @Override
    public String toString() {
        return triangleType() + "(" + a + ", " + b + ", " + c + ")";
    }

    public static void makeTriangles(int n) {

        if (n == 1) {
            System.out.println(new Triangle(1,1,1));
            return;
        }

        int a = 1;
        int b = 1;
        int c = 1;

        while (a <= n) {
            while (b <= n) {
                while (c <= n) {
                    System.out.println(new Triangle(a,b,c));
                    c++;
                }
                b++;
                c = 1;
            }
            a++;
            b = 1;
        }
    }
}
