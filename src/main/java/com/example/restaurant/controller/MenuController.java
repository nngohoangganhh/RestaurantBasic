package com.example.restaurant.controller;


import com.example.restaurant.entity.Menu;
import com.example.restaurant.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class MenuController {
    private final MenuService menuService;
     @GetMapping("/menu")
    public List<Menu> getMenu(){
        return menuService.getMenu();
    }
}
