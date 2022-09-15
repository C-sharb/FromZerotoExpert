package com.learn.fromzerotoexpert.exception;

public class FZEException extends Exception{

    private final Integer code;
    private final String message;

    public FZEException(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public FZEException(FZEExceptionEnum ex){
        this.code = ex.getCode();
        this.message = ex.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
