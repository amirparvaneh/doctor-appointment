package com.example.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Builder
@Getter
public class ErrorResponse {

    @Setter
    private String message;
    private String errorCode;
    private HttpStatus statusCode;
    @JsonIgnore
    private Map<String, Object> errorDetails = new HashMap<>();
    @JsonIgnore
    private Object[] params;

    public ErrorResponse(String message, String errorCode, HttpStatus statusCode, Object... params) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        if (Objects.nonNull(params)) {
            setErrorDetails(params);
        }
    }

    private void setErrorDetails(Object... params) {
        for (Object param : params) {
            this.errorDetails.put(" param : ", String.valueOf(param));
        }
    }
}
