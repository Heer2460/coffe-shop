package com.coffeshop.exception;

import lombok.Getter;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Getter
public class KnownException extends RuntimeException {

    private String message;

    private KnownExceptionMsgEnum responseCode;

    public KnownException(KnownExceptionMsgEnum codeMessage) {
        this.responseCode = codeMessage;
        this.message = codeMessage.getMessage();
    }

    public KnownException(String message) {
        this.message = message;
    }
}
