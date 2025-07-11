package com.foxsec.user_services.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceNameString, String fieldName, Object fieldValue) {
        super(
                String.format("%s not found with %s: '%s'", resourceNameString, fieldName, fieldValue));
    }

}
