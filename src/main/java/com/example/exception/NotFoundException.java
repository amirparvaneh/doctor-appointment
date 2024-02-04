package com.example.exception;

import com.example.global.ErrorResponse;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException {

    public NotFoundException(Long id){
        super(new ErrorResponse(
                "entity.not.found",
                "ex_001",
                HttpStatus.NOT_FOUND,
                id
        ));
    }
}
