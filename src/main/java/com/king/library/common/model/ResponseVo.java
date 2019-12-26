package com.king.library.common.model;

/**
 * @date: 2019/12/25 11:58
 * @author: duanyong
 * @desc:
 */
public class ResponseVo <T> {
    private Integer status;
    private String message;
    private T data;

    public ResponseVo(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseVo(String message) {
        this.status=500;
        this.message = message;
    }

    public ResponseVo(T data) {
        this.status=200;
        this.data = data;
    }

    public ResponseVo() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
