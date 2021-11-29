package com.girl.power.bankonet.exception;

public class ApplicationException extends Exception {
    private static final Long serialVersionUID = 5656565887665987L;

    public ApplicationException(String message) {
        super(message);
    }
}
