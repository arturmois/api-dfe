package br.com.api_dfe.api_dfe.exception;

public class SistemaException extends RuntimeException{

    public SistemaException(String message) {
        super(message);
    }

    public SistemaException(String message, Throwable cause) {
        super(message, cause);
    }
}
