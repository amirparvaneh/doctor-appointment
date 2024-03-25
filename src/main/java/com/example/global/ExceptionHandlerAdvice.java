package com.example.global;


import com.example.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Locale;

@RestControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    private final MessageSource messageSource;

    public ExceptionHandlerAdvice(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> exceptionAdviceHandler(BusinessException exception) {
        log.info(" an exception occurred because of : " + exception.getMessage());
        exception.getErrorResponse().setMessage(messageSource.getMessage(exception.getErrorResponse().getMessage(),
                exception.getErrorResponse().getParams(), Locale.getDefault()));
        return new ResponseEntity<>(exception.getErrorResponse(), exception.getErrorResponse().getStatusCode());
    }
}
