package com.example.restaurant.repository;

import com.example.restaurant.entity.TableRestaurant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TableRestaurantRepository extends JpaRepository<TableRestaurant, UUID> {}
