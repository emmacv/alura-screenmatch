package com.alura.screenmatch.errors;

public class NoRuntimeException extends RuntimeException {
    private final String message;
    public NoRuntimeException(String error) {
        message = error;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
