package com.example.exception;

import ch.qos.logback.core.spi.ErrorCodes;
import com.example.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BusinessException{
    public BadRequestException(){
        super(new ErrorResponse(
                "input.not.correct",
                "ex-001",
                HttpStatus.BAD_REQUEST
        ));
    }
}
