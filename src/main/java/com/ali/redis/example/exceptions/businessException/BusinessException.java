package com.ali.redis.example.exceptions.businessException;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BusinessException extends RuntimeException{
    private HttpStatus httpStatus;
    public BusinessException(String message,HttpStatus httpStatus) {
        super(message);
        this.httpStatus=httpStatus;
    }
}
