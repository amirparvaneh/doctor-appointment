package com.example.exception;

import com.example.global.ErrorResponse;

public class BusinessException extends RuntimeException{

    private ErrorResponse errorResponse;


    public BusinessException(){
    }

    public BusinessException(ErrorResponse errorResponse){
        super(errorResponse.getMessage());
        this.errorResponse = errorResponse;
    }

    public ErrorResponse getErrorResponse(){
        return errorResponse;
    }
}
