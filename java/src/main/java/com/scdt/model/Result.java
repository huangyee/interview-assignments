package com.scdt.model;

import static com.scdt.model.Constant.*;

public class Result<T> {
    private T data;

    private Integer code;

    public static <T> Result success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(HTTP_SUCCESS_STATUS_CODE);
        return result;
    }

    public static <T> Result fail(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(HTTP_FAIL_STATUS_CODE);
        return result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}