package com.example.restaurant.service.impl;

import com.example.restaurant.entity.Menu;
import com.example.restaurant.repository.MenuRepository;
import com.example.restaurant.service.MenuService;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Override
    public List<Menu> getMenu() {
        return menuRepository.findAll();
    }
}
