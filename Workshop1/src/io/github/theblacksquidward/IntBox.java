package io.github.theblacksquidward;

public class IntBox {

    private int x;

    public IntBox(int x) {
        this.x = x;
    }

    public IntBox add(int v) {
        x+=v;
        return this;
    }

    @Override
    public String toString() {
        return "IntBox(" + x + ")";
    }

}