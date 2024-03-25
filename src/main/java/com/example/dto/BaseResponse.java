package com.example.dto;


import lombok.Builder;

import java.io.Serializable;

@Builder
public class BaseResponse<T> implements Serializable {
    private String message;
    private T result;
}
