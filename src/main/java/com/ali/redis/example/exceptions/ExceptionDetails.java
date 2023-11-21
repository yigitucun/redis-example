package com.ali.redis.example.exceptions;

import lombok.Data;
@Data
public class ExceptionDetails {
    private String message;
    private long timestamp;
    private int code;
}
