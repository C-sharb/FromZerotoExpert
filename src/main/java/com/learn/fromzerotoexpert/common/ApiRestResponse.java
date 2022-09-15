package com.learn.fromzerotoexpert.common;


import com.learn.fromzerotoexpert.exception.FZEExceptionEnum;

public class ApiRestResponse <T>{
    private Integer status;

    private String message;

    private T data;

    private static final int OK_KODE = 10000;

    private static final String OK_MESSAGE = "SUCCESS";

    public ApiRestResponse(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiRestResponse() {
        this(OK_KODE,OK_MESSAGE);
    }


    public static <T> ApiRestResponse<T> success(){
        return new ApiRestResponse<>();
    }

    public static <T>ApiRestResponse<T> success(T result){
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);
        return response;
    }

    public static <T> ApiRestResponse<T> error(Integer code,String message){
        return new ApiRestResponse<>(code,message);
    }

    public static <T> ApiRestResponse<T> error(FZEExceptionEnum ex){
        return new ApiRestResponse<>(ex.getCode(),ex.getMessage());
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return message;
    }

    public void setMsg(String msg) {
        this.message = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

