package com.cleanhub.api.exception;

import org.springframework.http.HttpStatus;

public class CleanhubMessageException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final HttpStatus type;

    /**
     * @return the type
     */
    public HttpStatus getType() {
        return type;
    }


    public CleanhubMessageException(String message, HttpStatus type) {
        super(message);
        this.type = type;

    }

}
