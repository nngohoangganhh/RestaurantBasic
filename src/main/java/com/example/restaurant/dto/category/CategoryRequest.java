package com.example.restaurant.dto.category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest {
    @NotBlank(message = "Tên danh mục không được trống")
    private String name;

    @NotNull(message = "Thứ tự hiển thị không được trống")
    private Integer displayOrder;
    //kiểu dữ liệu khác không phải kiểu nguyên thủy

}
