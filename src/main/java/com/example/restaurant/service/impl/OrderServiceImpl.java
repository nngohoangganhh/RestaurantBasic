package com.example.restaurant.service.impl;

import com.example.restaurant.entity.Order;
import com.example.restaurant.repository.OrderRepository;
import com.example.restaurant.service.OrderService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
