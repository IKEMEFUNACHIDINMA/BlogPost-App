package com.example.demo.exceptions;

public class HandleEventDoesNotExistException extends RuntimeException{
    public HandleEventDoesNotExistException(String message) {
        super(message);
    }
}
