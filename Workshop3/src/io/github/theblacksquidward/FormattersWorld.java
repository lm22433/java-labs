package io.github.theblacksquidward;

import java.util.stream.Stream;

public class FormattersWorld {

    public static void main(String[] args) {
        final String input = "Hello world!";
        Stream.of(new IdentifyFormatter(), new UppercaseFormatter())
                .map(formatter -> formatter.format(input))
                .forEach(System.out::println);
    }

    interface Formatter {
        String format(String input);
    }

    static class IdentifyFormatter implements Formatter {
        @Override
        public String format(String input) {
            return input;
        }
    }

    static class UppercaseFormatter implements Formatter {
        @Override
        public String format(String input) {
            return input.toUpperCase();
        }
    }

}
