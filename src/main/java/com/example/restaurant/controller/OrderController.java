package com.example.restaurant.controller;

import com.example.restaurant.dto.order.OrderRequest;
import com.example.restaurant.dto.order.OrderResponse;
import com.example.restaurant.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class OrderController {
    private final OrderService  orderService;

    @PostMapping("/products")
    public ResponseEntity<OrderResponse> create( @RequestBody OrderRequest request) {
        return ResponseEntity.ok( orderService.create(request));
    }
}
