package dev.shaaf.jgraphlet;

public class CycleDetectedException extends RuntimeException {
    
    public CycleDetectedException(String message) {
        super(message);
    }
    
    public CycleDetectedException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public CycleDetectedException(Throwable cause) {
        super(cause);
    }
}