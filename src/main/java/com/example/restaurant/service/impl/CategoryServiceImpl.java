package com.example.restaurant.service.impl;

import com.example.restaurant.dto.category.CategoryRequest;
import com.example.restaurant.dto.category.CategoryResponse;
import com.example.restaurant.entity.Category;
import com.example.restaurant.exception.CategoryAlreadyExistsException;
import com.example.restaurant.repository.CategoryRepository;
import com.example.restaurant.service.CategoryService;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryResponse createCategory(CategoryRequest request) {
        if (categoryRepository.existsByName(request.getName()))
            throw new CategoryAlreadyExistsException(request.getName());

        Category category = new Category();
        category.setName(request.getName());
        category.setDisplayOrder(request.getDisplayOrder());
        category.setCreateAt(LocalDateTime.now());
        category.setUpdateAt(LocalDateTime.now());

        Category savedCategory = categoryRepository.save(category);

        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setId(savedCategory.getId());
        categoryResponse.setName(savedCategory.getName());
        categoryResponse.setDisplayOrder(savedCategory.getDisplayOrder());
        categoryResponse.setCreateAt(savedCategory.getCreateAt());
        categoryResponse.setUpdateAt(savedCategory.getUpdateAt());
        return categoryResponse;
    }

    @Override
    public CategoryResponse updateCategory(CategoryRequest request, UUID id) {
       Category category = categoryRepository.findById(id).orElseThrow(()->
               new ResponseStatusException(HttpStatus.BAD_REQUEST,"không tìm thấy category"));
       CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId(category.getId());
        categoryResponse.setName(category.getName());
        categoryResponse.setDisplayOrder(category.getDisplayOrder());
        categoryResponse.setCreateAt(category.getUpdateAt());
        categoryResponse.setUpdateAt(category.getUpdateAt());
        return categoryResponse;
    }
    @Override
    public void deleteCategory(UUID id){
     if (!categoryRepository.existsById(id)){
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"không tìm thấy question");
     }
     categoryRepository.deleteById(id);
    }
}
