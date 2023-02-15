package io.github.theblacksquidward;

import java.util.function.Function;
import java.util.function.Supplier;

public class Maybe<T> {

    final T value;

    private Maybe(T value) {
        this.value = value;
    }

    public static <T> Maybe<T> nothing() {
        return new Maybe<>(null);
    }

    public static <T> Maybe<T> just(T value) {
        return new Maybe<>(value);
    }

    boolean isEmpty() {
        return value == null;
    }

    public <U> Maybe<U> map(Function<T, U> function) {
        return isEmpty() ? nothing() : Maybe.just(function.apply(value));
    }

    public <U> Maybe<U> flatMap(Function<T, Maybe<U>> function) {
        return isEmpty() ? nothing() : function.apply(value);
    }

    public <U> U fold(Function<T, U> function, Supplier<U> supplier) {
        return isEmpty() ? supplier.get() : function.apply(value);
    }

    public T get() {
        return value;
    }

}
