package com.example.model;

public enum Status {
    OPEN(1),
    TAKEN(0),
    DELETED(-1);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
