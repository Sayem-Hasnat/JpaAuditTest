package com.example.practise02_jpaaudit_restapitest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String messege){
        super(messege);
    }

    public ResourceNotFoundException(String messege, Throwable cause){
        super(messege, cause);
    }

}
