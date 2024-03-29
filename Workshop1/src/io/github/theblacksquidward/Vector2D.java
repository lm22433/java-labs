package io.github.theblacksquidward;

public class Vector2D {

    private final double x;
    private final double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Vector2D add(Vector2D v) {
        return new Vector2D(x + v.getX(), y + v.getY());
    }

    Vector2D scale(double f) {
        return new Vector2D(x * f, y * f);
    }

    @Override
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    public double modulus() {

        double a  = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(a);
    }

    public double distance(Vector2D v) {

        Vector2D a = v.scale(-1);
        Vector2D b = this.add(a);
        return b.modulus();
    }


}
