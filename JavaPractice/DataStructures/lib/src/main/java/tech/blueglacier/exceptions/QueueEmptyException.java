package tech.blueglacier.exceptions;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}
