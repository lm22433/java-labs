package io.github.theblacksquidward;

public class FormattersWorld {

    public static void main(String[] args) {

    }

    interface Formatter {
        String format(String input);
    }

    class IdentifyFormat implements Formatter {
        @Override
        public String format(String input) {
            return input;
        }
    }

}
