package org.bamsy.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String badCredentials) {
        super(badCredentials);
    }
}
