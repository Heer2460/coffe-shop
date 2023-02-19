package com.coffeshop.helper;

import java.io.Serializable;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
public class ApiError implements Serializable {
    private static final Long serialVersionUID = 1L;
    private String type;
    private String value;

    public String toString() {
        return "ApiError{type='" + this.type + '\'' + ", value='" + this.value + '\'' + '}';
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ApiError() {
    }

    public ApiError(String type, String value) {
        this.type = type;
        this.value = value;
    }
}
