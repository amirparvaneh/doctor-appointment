package com.example.exception;

import com.example.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class UnknownException extends BusinessException{
    public UnknownException(){
        super(new ErrorResponse(
                "unknown.type.error",
                "ex-002",
                HttpStatus.INTERNAL_SERVER_ERROR
        ));
    }
}
