package com.example.restaurant.service.impl;

import com.example.restaurant.entity.Category;
import com.example.restaurant.repository.CategoryRepository;
import com.example.restaurant.service.CategoryService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }
}
