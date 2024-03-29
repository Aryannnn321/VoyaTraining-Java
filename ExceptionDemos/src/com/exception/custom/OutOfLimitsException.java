package com.exception.custom;

public class OutOfLimitsException extends Exception {
    public OutOfLimitsException() {
    }

    public OutOfLimitsException(String message) {
        super(message);
    }
}
