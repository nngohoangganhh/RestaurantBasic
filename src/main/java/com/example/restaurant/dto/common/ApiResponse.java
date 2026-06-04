package com.example.restaurant.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {
    private String status;
    private String code;
    private String message;
    private T data;
}
