package com.king.library.common.model;

import com.king.library.common.constants.StatusEnum;

/**
 * @date: 2019/12/25 11:58
 * @author: duanyong
 * @desc:
 */
public class ResponseVo <T> {
    private String status;
    private String message;
    private T data;

    public ResponseVo(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseVo(String message) {
        this.status= StatusEnum.ERROR.getCode();
        this.message = message;
    }

    public ResponseVo(T data) {
        this.status=StatusEnum.SUCCESS.getCode();
        this.data = data;
    }

    public ResponseVo() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
