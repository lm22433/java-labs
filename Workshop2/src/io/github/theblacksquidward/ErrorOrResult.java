package io.github.theblacksquidward;

public class ErrorOrResult {

    static ErrorOrResult parseIntOrFail(String input) {
        int result;
        boolean failed;
        String error;
        try {
            result = Integer.parseInt(input);
            failed = false;
            error = "";
        } catch (NumberFormatException e) {
            result = 0;
            failed = true;
            error = e.getMessage();
        }
        return new ErrorOrResult(result, failed, error);
    }

    private final int result;
    private final boolean failed;
    private final String error;

    public ErrorOrResult(int result, boolean failed, String error) {
        this.result = result;
        this.failed = failed;
        this.error = error;
    }

    boolean failed() {
        return this.failed;
    }

    String error() {
        return this.error;
    }

    int result() {
        return this.result;
    }

    @Override
    public String toString() {
        return failed ? "Error: " + error : String.valueOf(result);
    }
}
