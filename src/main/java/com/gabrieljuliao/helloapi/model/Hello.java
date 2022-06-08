package com.gabrieljuliao.helloapi.model;

import java.sql.Timestamp;

public class Hello {
    private String HttpMethod;
    private String message;
    private Timestamp timestamp;

    public Hello() {
    }

    public Hello(String httpMethod, String msg, Timestamp timestamp) {
        HttpMethod = httpMethod;
        this.message = msg;
        this.timestamp = timestamp;
    }

    public String getHttpMethod() {
        return HttpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        HttpMethod = httpMethod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
