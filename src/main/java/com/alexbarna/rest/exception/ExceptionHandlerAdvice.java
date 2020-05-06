package com.alexbarna.rest.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity userNotFound(UserNotFoundException ex){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity otherException(Throwable ex){
        return ResponseEntity.status(500)
                .body("ouch, something went wrong");
    }
}
