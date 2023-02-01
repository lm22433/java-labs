package io.github.theblacksquidward;

public class Vector2D {

    private final double x;
    private final double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    public double modulus() {

        double a  = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(a);
    }


}
