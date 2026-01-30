package com.workintech.fswebs18challengemaven.exceptions;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CardException.class)
    public ResponseEntity<CardErrorResponse> handleCardException(CardException ex) {
        return ResponseEntity.status(ex.getHttpStatus())
                .body(new CardErrorResponse(ex.getMessage()));


    }
}