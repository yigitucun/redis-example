package com.ali.redis.example.exceptions.validationException;

import lombok.Data;

import java.util.Map;

@Data
public class ValidationExceptionDetails {
    private long timestamp;
    private Map<String,String> validationErrors;
    private int code;
}
