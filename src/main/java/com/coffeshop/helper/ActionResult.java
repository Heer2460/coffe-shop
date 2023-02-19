package com.coffeshop.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
public class ActionResult<T> {
    public static final int TOKEN_SUCCESS_CODE = 201;
    public static final int SUCCESS_CODE = 200;
    public static final int RELOGIN_CODE = 300;
    public static final int PARAM_ERROR_CODE = 400;
    public static final int ERROR_CODE = 500;
    public static final int NOT_FOUND = 404;
    public static final int FORBIDDEN = 403;
    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;
    @JsonProperty("api_errors")
    private List<ApiError> apiErrors;

    public ActionResult(int code) {
        this.code = code;
    }

    public ActionResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public ActionResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ActionResult(int code, String message, List<ApiError> apiErrors) {
        this.code = code;
        this.message = message;
        this.apiErrors = apiErrors;
    }

    public ActionResult(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public ActionResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ActionResult<T> success(T data) {
        return new ActionResult(HttpStatus.OK.value(), "success", data);
    }

    public static <T> ActionResult<T> success(String message, T data) {
        return new ActionResult(HttpStatus.OK.value(), message, data);
    }

    public static <T> ActionResult<T> success() {
        return new ActionResult(200, "success");
    }

    public static <T> ActionResult<T> reLogin() {
        return new ActionResult(300, "reLogin");
    }

    public static <T> ActionResult<T> tokenExpired() {
        return apiError(Collections.singletonList(new ApiError("auth", "token_expired")));
    }

    public static <T> ActionResult<T> failure(String message) {
        return new ActionResult(500, message);
    }

    public static <T> ActionResult<T> failure(String message, List<ApiError> apiErrors) {
        return new ActionResult(500, message, apiErrors);
    }

    public static <T> ActionResult<T> failure(int code, String message, List<ApiError> apiErrors) {
        return new ActionResult(code, message, apiErrors);
    }

    public static <T> ActionResult<T> paramError(String message) {
        return new ActionResult(400, message);
    }

    public static <T> ActionResult<T> someError(int code, String message) {
        return new ActionResult(code, message);
    }

    public static <T> ActionResult<T> notFound(String message) {
        return new ActionResult(404, message);
    }

    public static <T> ActionResult<T> forbidden(String message) {
        return new ActionResult(403, message);
    }

    public static <T> ActionResult<T> forbidden(String message, T data) {
        return new ActionResult(403, message, data);
    }

    public static <T> ActionResult<T> apiError(List<ApiError> apiErrors) {
        ActionResult<T> result = new ActionResult();
        result.setApiErrors(apiErrors);
        return result;
    }

    public String toString() {
        return "ActionResult [code=" + this.code + ", message=" + this.message + ", data=" + this.data + "]";
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public List<ApiError> getApiErrors() {
        return this.apiErrors;
    }

    @JsonProperty("code")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("data")
    public void setData(T data) {
        this.data = data;
    }

    @JsonProperty("api_errors")
    public void setApiErrors(List<ApiError> apiErrors) {
        this.apiErrors = apiErrors;
    }

    public ActionResult() {
    }
}

