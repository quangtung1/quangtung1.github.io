package com.example.demothymleaf.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalSeverEx extends RuntimeException {
    public InternalSeverEx(String message){
        super(message);
    }
}
