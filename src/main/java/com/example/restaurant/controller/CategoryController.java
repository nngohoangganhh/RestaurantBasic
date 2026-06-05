package com.example.restaurant.controller;

import com.example.restaurant.dto.category.CategoryRequest;
import com.example.restaurant.dto.category.CategoryResponse;
import com.example.restaurant.entity.Category;
import com.example.restaurant.service.impl.CategoryServiceImpl;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CategoryController {
    private final CategoryServiceImpl categoryServiceImpl;

    @GetMapping("/categories")
    public List<Category> getCategory() {
        return categoryServiceImpl.getCategory();
    }

    @PostMapping("/categories")
    public CategoryResponse createCategory(@Valid @RequestBody CategoryRequest request) {
        return categoryServiceImpl.createCategory(request);
    }

    @PutMapping("/categories/{id}")
    public CategoryResponse updateCategory(
            @RequestBody CategoryRequest request, @PathVariable UUID id) {
        return categoryServiceImpl.updateCategory(request, id);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable UUID id) {
        categoryServiceImpl.deleteCategory(id);
    }
}
