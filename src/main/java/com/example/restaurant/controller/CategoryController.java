package com.example.restaurant.controller;

import com.example.restaurant.entity.Category;
import com.example.restaurant.service.impl.CategoryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CategoryController {
    private final CategoryServiceImpl categoryServiceImpl;
    @GetMapping("/category")
    public List<Category> getCategory(){
         return categoryServiceImpl.getCategory();
    }
}
