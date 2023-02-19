package com.coffeshop.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Getter
@AllArgsConstructor
public enum KnownExceptionMsgEnum {
    API_GROUP_NOT_EMPTY(10001,"API group is empty"),
    INVALID_CREDENTIALS(10002,"The password does not match to this account!"),
    INVALID_EMAIL(10003,"Email does not exists"),
    EMAIL_NOT_VERIFIED(10004,"The email is not verified, please verify email first."),
    INVALID_PASSWORD(10005,"Please choose a different password!"),
    TOKEN_EXPIRED(10006,"Token is expired!"),
    INVALID_TOKEN(10007,"Invalid Token!"),
    USER_NOT_FOUND(10008,"user not found."),
    DUPLICATE_EMAIL(10009,"email already exists."),

    PASSWORD_DIFFERENT(10010,"Two passwords are different."),

    ILLEGAL_SIGN(10011, "illegal sign."),
    INVALID_ID(10012,"Id is empty"),

    ;


    private int code;

    private String message;

}
