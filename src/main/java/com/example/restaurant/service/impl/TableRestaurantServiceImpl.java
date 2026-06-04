package com.example.restaurant.service.impl;

import com.example.restaurant.entity.TableRestaurant;
import com.example.restaurant.repository.TableRestaurantRepository;
import com.example.restaurant.service.TableRestaurantService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TableRestaurantServiceImpl implements TableRestaurantService {
    private final TableRestaurantRepository tableRestaurantRepository;

    @Override
    public List<TableRestaurant> getTableRestaurant() {
        return tableRestaurantRepository.findAll();
    }
}
