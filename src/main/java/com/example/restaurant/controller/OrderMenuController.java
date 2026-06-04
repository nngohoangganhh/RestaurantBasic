package com.example.restaurant.controller;

import com.example.restaurant.entity.OrderMenu;
import com.example.restaurant.service.OrderMenuService;
import com.example.restaurant.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
@AllArgsConstructor
public class OrderMenuController {
    private final OrderMenuService orderMenuService;
    @GetMapping("OrderMenu")
    public List<OrderMenu> getOrderMenu(){
        return orderMenuService.getOrderMenu();
    }

}
