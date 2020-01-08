package com.leyou.registry.result;

public class AppException extends RuntimeException{

    private static final long serialVersionUID = -9047362730566418749L;

    private String message;
    private Integer keyCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(Integer keyCode) {
        this.keyCode = keyCode;
    }
}
