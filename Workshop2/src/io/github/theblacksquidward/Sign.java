package io.github.theblacksquidward;

public enum Sign {

    POSITIVE,
    NEGATIVE;

    Sign flip() {
        return this.equals(POSITIVE) ? NEGATIVE : POSITIVE;
    }

    @Override
    public String toString() {
        return this.equals(POSITIVE) ? "+" : "-";
    }

}
