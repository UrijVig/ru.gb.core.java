package src.main.java.app.exceptions;

public class ExpectedAmountDataException extends RuntimeException {
    public ExpectedAmountDataException(int extended, int current, String massage, String data) {
        super(String.format("%d %s expected, %d %s received, processing error: %s"
                , extended, data, current, data, massage));
    }
}
