package io.github.theblacksquidward;

import java.util.stream.Stream;

public class FormattersWorld {

    public static void main(String[] args) {
        final String input = "Hello world!";
        Stream.of(new IdentifyFormatter(), new UppercaseFormatter(), new ROT13Formatter())
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

    static class ROT13Formatter implements Formatter {
        @Override
        public String format(String input) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if       (c >= 'a' && c <= 'm') c += 13;
                else if  (c >= 'A' && c <= 'M') c += 13;
                else if  (c >= 'n' && c <= 'z') c -= 13;
                else if  (c >= 'N' && c <= 'Z') c -= 13;
                sb.append(c);
            }
            return sb.toString();
        }
    }

}
