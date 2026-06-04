package com.example.restaurant.controller;

import com.example.restaurant.dto.order.OrderRequest;
import com.example.restaurant.dto.order.OrderResponse;
import com.example.restaurant.entity.Order;
import com.example.restaurant.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class OrderController {
    private final OrderService  orderService;

//    @PostMapping("/products")
//    public ResponseEntity<OrderResponse> create( @RequestBody OrderRequest request) {
//        return ResponseEntity.ok(orderService.create(request));
//    }
//    @GetMapping("/all")
//    public List<Order> getOrders(){
//        return orderService.getOrders();
//    }
}
