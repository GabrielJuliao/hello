package com.gabrieljuliao.helloapi.model;

public enum HttpMethod {
    GET("get"), POST("post"), PUT("put"), PATCH("patch"), DELETE("delete");
    private String value;
    HttpMethod(String value) {
        this.value = value;
    }
}
