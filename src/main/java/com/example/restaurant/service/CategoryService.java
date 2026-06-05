package com.example.restaurant.service;

import com.example.restaurant.dto.category.CategoryRequest;
import com.example.restaurant.dto.category.CategoryResponse;
import com.example.restaurant.entity.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> getCategory();

    CategoryResponse createCategory(CategoryRequest request);

    CategoryResponse updateCategory(CategoryRequest request, UUID id);

    void deleteCategory(UUID id);
}
