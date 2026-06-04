package com.example.restaurant.repository;

import com.example.restaurant.entity.OrderMenu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderMenuRespsitory extends JpaRepository<OrderMenu, UUID> {}
