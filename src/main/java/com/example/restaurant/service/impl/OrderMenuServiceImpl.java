package com.example.restaurant.service.impl;

import com.example.restaurant.entity.OrderMenu;
import com.example.restaurant.repository.OrderMenuRespsitory;
import com.example.restaurant.service.OrderMenuService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderMenuServiceImpl implements OrderMenuService {
    private final OrderMenuRespsitory orderMenuRespsitory;

    @Override
    public List<OrderMenu> getOrderMenu() {
        return orderMenuRespsitory.findAll();
    }
}
