package com.example.restaurant.repository;

import com.example.restaurant.entity.Category;

import jakarta.validation.constraints.NotBlank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    boolean existsByName(@NotBlank(message = "Tên danh mục không được trống") String name);
}
