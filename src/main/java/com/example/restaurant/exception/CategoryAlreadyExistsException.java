package com.example.restaurant.exception;

import jakarta.validation.constraints.NotBlank;

public class CategoryAlreadyExistsException extends RuntimeException{
    public CategoryAlreadyExistsException(String message) {
        super(message);
    }
}
