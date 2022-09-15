package com.learn.fromzerotoexpert.exception;

/**
 * 项目异常枚举
 */
public enum FZEExceptionEnum {

    NEED_USER_NAME(10001,"用户名不能为空"),
    NEED_PASSWORD(10002,"用户密码不能为空"),

    USER_EXISTED(10003,"用户已存在"),

    INSERT_FAILED(10004,"注册失败");
    Integer code;//异常状态码

    String message;//异常信息

    FZEExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
