package com.example.global;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
public class ErrorResponse {

    @Getter
    private String message;
    private String errorCode;
    private HttpStatus statusCode;
    private Object[] params;


}
