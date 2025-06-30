package com.foxsec.user_services.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.foxsec.user_services.dto.ErrorResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ErrorResponseDto> handleUserAlreadyExistException(UserAlreadyExistException ex,WebRequest request) {
        ErrorResponseDto errorResponse = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                LocalDateTime.now()
                
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }


}