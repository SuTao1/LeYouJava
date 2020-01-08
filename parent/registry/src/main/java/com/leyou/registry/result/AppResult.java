package com.leyou.registry.result;

import java.io.Serializable;

public class AppResult implements Serializable {

    private static final long serialVersionUID = 410759416935569930L;

    private Boolean state;
    private String message;
    private Integer keyCode;
    private Object data;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public AppResult() {
        super();
    }

    public AppResult(Boolean state, String message, Integer keyCode, Object data) {
        this.state = state;
        this.message = message;
        this.keyCode = keyCode;
        this.data = data;
    }
}
